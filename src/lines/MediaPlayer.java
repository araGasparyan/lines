package lines;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MediaPlayer implements Runnable {

    private String filename;

    private AudioInputStream audioStream = null;
    private AudioFormat audioFormat = null;
    private SourceDataLine sourceLine = null;

    private volatile boolean stopFlag = false;
    private volatile boolean pauseFlag = false;
    private volatile boolean isPlayingFlag = false;
    private volatile float volume_dB = 0.0f;

    public MediaPlayer(String filename) {
        this.filename = filename;
    }

    /**
     * @throws IOException
     * @throws UnsupportedAudioFileException
     * @throws FileNotFoundException
     * @throws LineUnavailableException
     */
    public void playSound() throws FileNotFoundException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        isPlayingFlag = true;

        if (filename.toLowerCase().endsWith(".txt")) {
            System.out.println("Text Files Not Supported!");
        } else // if (filename.toLowerCase().endsWith(".mp3") || filename.toLowerCase().endsWith(".ogg"))
        {

            final URL fileurl = new URL("file:///" + System.getProperty("user.dir") + filename);
            final AudioInputStream in = AudioSystem.getAudioInputStream(fileurl);

            final AudioFormat baseFormat = in.getFormat();
            audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
                    baseFormat.getSampleRate(),
                    16,
                    baseFormat.getChannels(),
                    baseFormat.getChannels() * 2,
                    baseFormat.getSampleRate(),
                    false);
            audioStream = AudioSystem.getAudioInputStream(audioFormat, in);
            final byte[] data = new byte[4096];
            try {
                SourceDataLine res = null;
                DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
                res = (SourceDataLine) AudioSystem.getLine(info);
                res.open(audioFormat);
                sourceLine = res;

                // Start
                onPlay();
                sourceLine.start();
                int nBytesRead = 0;// nBytesWritten = 0;
                while ((nBytesRead != -1) && (!stopFlag)) {
                    if (!pauseFlag) {
                        isPlayingFlag = true;
                        nBytesRead = audioStream.read(data, 0, data.length);
                        if (nBytesRead != -1) {
                            if (sourceLine.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                                ((FloatControl) sourceLine.getControl(FloatControl.Type.MASTER_GAIN)).setValue(volume_dB);
                            }
                            sourceLine.write(data, 0, nBytesRead);
                        }
                    } else {
                        isPlayingFlag = false;
                    }
                }

                // Stop
                sourceLine.drain();
                sourceLine.stop();
                sourceLine.close();
                audioStream.close();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            in.close();

            isPlayingFlag = false;
            onStop();

        }
    }

    @Override
    public void run() {
        stopFlag = false;
        pauseFlag = false;

        try {
            playSound();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        run();
    }

    public void onPlay() {
    }

    public void onStop() {
    }

    public void setFile(String filename) {
        this.filename = filename;
    }
}
