/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ara Gasparyan
 */
public class LFrame extends JFrame implements ActionListener, MouseListener {

    private final JPanel gridpanel = new JPanel();
    private final JPanel panelatributes = new JPanel();
    private final JPanel panellinescorp = new JPanel();
    private final JPanel mainpanel = new JPanel();
    private final LPanel leftpanel = new LPanel();
    private final RPanel rightpanel = new RPanel();
    private final JPanel basicpanel = new JPanel();
    private final JLabel label[] = new JLabel[81];

    private final Icon ball[] = new ImageIcon[81];

    private final GridLayout g;
    private Setter s;
    private final JMenuBar menubar = new JMenuBar();
    private final JMenu menu1 = new JMenu("Game");
    private final JMenu item1 = new JMenu("New Game");
    private final JMenuItem item1_1 = new JMenuItem("Easy");
    private final JMenuItem item1_2 = new JMenuItem("Normal");
    private final JMenuItem item1_3 = new JMenuItem("Professional");
    private final JMenuItem item10 = new JMenuItem("Exit");
    private final JLabel busy = new JLabel();
    private final JLabel points = new JLabel();
    private final JLabel linescorptext = new JLabel();

    private MediaPlayer song = new MediaPlayer("/assets/audio/fonSong.au");

    private final Icon blue = new ImageIcon("assets/static/blue.gif");
    private final Icon red = new ImageIcon("assets/static/red.gif");
    private final Icon darkblue = new ImageIcon("assets/static/darkblue.gif");
    private final Icon yellow = new ImageIcon("assets/static/yellow.gif");
    private final Icon green = new ImageIcon("assets/static/green.gif");
    private final Icon magenta = new ImageIcon("assets/static/magenta.gif");
    private final Icon empty = new ImageIcon("assets/static/empty.gif");

    private final Icon mblue = new ImageIcon("assets/clickmotion/mblue.gif");
    private final Icon mred = new ImageIcon("assets/clickmotion/mred.gif");
    private final Icon mdarkblue = new ImageIcon("assets/clickmotion/mdarkblue.gif");
    private final Icon myellow = new ImageIcon("assets/clickmotion/myellow.gif");
    private final Icon mgreen = new ImageIcon("assets/clickmotion/mgreen.gif");
    private final Icon mmagenta = new ImageIcon("assets/clickmotion/mmagenta.gif");

    private final int boomanimsleeptime;

    // Magenta boom balls
    Icon mboom1 = new ImageIcon("assets/mboom/boom-01.png");
    Icon mboom2 = new ImageIcon("assets/mboom/boom-02.png");
    Icon mboom3 = new ImageIcon("assets/mboom/boom-03.png");
    Icon mboom4 = new ImageIcon("assets/mboom/boom-04.png");
    Icon mboom5 = new ImageIcon("assets/mboom/boom-05.png");
    Icon mboom6 = new ImageIcon("assets/mboom/boom-06.png");
    Icon mboom7 = new ImageIcon("assets/mboom/boom-07.png");
    Icon mboom8 = new ImageIcon("assets/mboom/boom-08.png");
    Icon mboom9 = new ImageIcon("assets/mboom/boom-09.png");
    Icon mboom10 = new ImageIcon("assets/mboom/boom-10.png");
    Icon mboom11 = new ImageIcon("assets/mboom/boom-11.png");
    Icon mboom12 = new ImageIcon("assets/mboom/boom-12.png");
    Icon mboom13 = new ImageIcon("assets/mboom/boom-13.png");
    Icon mboom14 = new ImageIcon("assets/mboom/boom-14.png");
    Icon mboom15 = new ImageIcon("assets/mboom/boom-15.png");
    Icon mboom16 = new ImageIcon("assets/mboom/boom-16.png");
    Icon mboom17 = new ImageIcon("assets/mboom/boom-17.png");
    Icon mboom18 = new ImageIcon("assets/mboom/boom-18.png");
    Icon mboom19 = new ImageIcon("assets/mboom/boom-19.png");
    Icon mboom20 = new ImageIcon("assets/mboom/boom-20.png");

    // Darkblue boom balls
    Icon dbboom1 = new ImageIcon("assets/dbboom/boom-01.png");
    Icon dbboom2 = new ImageIcon("assets/dbboom/boom-02.png");
    Icon dbboom3 = new ImageIcon("assets/dbboom/boom-03.png");
    Icon dbboom4 = new ImageIcon("assets/dbboom/boom-04.png");
    Icon dbboom5 = new ImageIcon("assets/dbboom/boom-05.png");
    Icon dbboom6 = new ImageIcon("assets/dbboom/boom-06.png");
    Icon dbboom7 = new ImageIcon("assets/dbboom/boom-07.png");
    Icon dbboom8 = new ImageIcon("assets/dbboom/boom-08.png");
    Icon dbboom9 = new ImageIcon("assets/dbboom/boom-09.png");
    Icon dbboom10 = new ImageIcon("assets/dbboom/boom-10.png");
    Icon dbboom11 = new ImageIcon("assets/dbboom/boom-11.png");
    Icon dbboom12 = new ImageIcon("assets/dbboom/boom-12.png");
    Icon dbboom13 = new ImageIcon("assets/dbboom/boom-13.png");
    Icon dbboom14 = new ImageIcon("assets/dbboom/boom-14.png");
    Icon dbboom15 = new ImageIcon("assets/dbboom/boom-15.png");
    Icon dbboom16 = new ImageIcon("assets/dbboom/boom-16.png");
    Icon dbboom17 = new ImageIcon("assets/dbboom/boom-17.png");
    Icon dbboom18 = new ImageIcon("assets/dbboom/boom-18.png");
    Icon dbboom19 = new ImageIcon("assets/dbboom/boom-19.png");
    Icon dbboom20 = new ImageIcon("assets/dbboom/boom-20.png");

    // Blue boom balls
    Icon bboom1 = new ImageIcon("assets/bboom/boom-01.png");
    Icon bboom2 = new ImageIcon("assets/bboom/boom-02.png");
    Icon bboom3 = new ImageIcon("assets/bboom/boom-03.png");
    Icon bboom4 = new ImageIcon("assets/bboom/boom-04.png");
    Icon bboom5 = new ImageIcon("assets/bboom/boom-05.png");
    Icon bboom6 = new ImageIcon("assets/bboom/boom-06.png");
    Icon bboom7 = new ImageIcon("assets/bboom/boom-07.png");
    Icon bboom8 = new ImageIcon("assets/bboom/boom-08.png");
    Icon bboom9 = new ImageIcon("assets/bboom/boom-09.png");
    Icon bboom10 = new ImageIcon("assets/bboom/boom-10.png");
    Icon bboom11 = new ImageIcon("assets/bboom/boom-11.png");
    Icon bboom12 = new ImageIcon("assets/bboom/boom-12.png");
    Icon bboom13 = new ImageIcon("assets/bboom/boom-13.png");
    Icon bboom14 = new ImageIcon("assets/bboom/boom-14.png");
    Icon bboom15 = new ImageIcon("assets/bboom/boom-15.png");
    Icon bboom16 = new ImageIcon("assets/bboom/boom-16.png");
    Icon bboom17 = new ImageIcon("assets/bboom/boom-17.png");
    Icon bboom18 = new ImageIcon("assets/bboom/boom-18.png");
    Icon bboom19 = new ImageIcon("assets/bboom/boom-19.png");
    Icon bboom20 = new ImageIcon("assets/bboom/boom-20.png");

    // Red boom balls
    Icon rboom1 = new ImageIcon("assets/rboom/boom-01.png");
    Icon rboom2 = new ImageIcon("assets/rboom/boom-02.png");
    Icon rboom3 = new ImageIcon("assets/rboom/boom-03.png");
    Icon rboom4 = new ImageIcon("assets/rboom/boom-04.png");
    Icon rboom5 = new ImageIcon("assets/rboom/boom-05.png");
    Icon rboom6 = new ImageIcon("assets/rboom/boom-06.png");
    Icon rboom7 = new ImageIcon("assets/rboom/boom-07.png");
    Icon rboom8 = new ImageIcon("assets/rboom/boom-08.png");
    Icon rboom9 = new ImageIcon("assets/rboom/boom-09.png");
    Icon rboom10 = new ImageIcon("assets/rboom/boom-10.png");
    Icon rboom11 = new ImageIcon("assets/rboom/boom-11.png");
    Icon rboom12 = new ImageIcon("assets/rboom/boom-12.png");
    Icon rboom13 = new ImageIcon("assets/rboom/boom-13.png");
    Icon rboom14 = new ImageIcon("assets/rboom/boom-14.png");
    Icon rboom15 = new ImageIcon("assets/rboom/boom-15.png");
    Icon rboom16 = new ImageIcon("assets/rboom/boom-16.png");
    Icon rboom17 = new ImageIcon("assets/rboom/boom-17.png");
    Icon rboom18 = new ImageIcon("assets/rboom/boom-18.png");
    Icon rboom19 = new ImageIcon("assets/rboom/boom-19.png");
    Icon rboom20 = new ImageIcon("assets/rboom/boom-20.png");

    // Yellow boom balls
    Icon yboom1 = new ImageIcon("assets/yboom/boom-01.png");
    Icon yboom2 = new ImageIcon("assets/yboom/boom-02.png");
    Icon yboom3 = new ImageIcon("assets/yboom/boom-03.png");
    Icon yboom4 = new ImageIcon("assets/yboom/boom-04.png");
    Icon yboom5 = new ImageIcon("assets/yboom/boom-05.png");
    Icon yboom6 = new ImageIcon("assets/yboom/boom-06.png");
    Icon yboom7 = new ImageIcon("assets/yboom/boom-07.png");
    Icon yboom8 = new ImageIcon("assets/yboom/boom-08.png");
    Icon yboom9 = new ImageIcon("assets/yboom/boom-09.png");
    Icon yboom10 = new ImageIcon("assets/yboom/boom-10.png");
    Icon yboom11 = new ImageIcon("assets/yboom/boom-11.png");
    Icon yboom12 = new ImageIcon("assets/yboom/boom-12.png");
    Icon yboom13 = new ImageIcon("assets/yboom/boom-13.png");
    Icon yboom14 = new ImageIcon("assets/yboom/boom-14.png");
    Icon yboom15 = new ImageIcon("assets/yboom/boom-15.png");
    Icon yboom16 = new ImageIcon("assets/yboom/boom-16.png");
    Icon yboom17 = new ImageIcon("assets/yboom/boom-17.png");
    Icon yboom18 = new ImageIcon("assets/yboom/boom-18.png");
    Icon yboom19 = new ImageIcon("assets/yboom/boom-19.png");
    Icon yboom20 = new ImageIcon("assets/yboom/boom-20.png");

    // Green boom balls
    Icon gboom1 = new ImageIcon("assets/gboom/boom-01.png");
    Icon gboom2 = new ImageIcon("assets/gboom/boom-02.png");
    Icon gboom3 = new ImageIcon("assets/gboom/boom-03.png");
    Icon gboom4 = new ImageIcon("assets/gboom/boom-04.png");
    Icon gboom5 = new ImageIcon("assets/gboom/boom-05.png");
    Icon gboom6 = new ImageIcon("assets/gboom/boom-06.png");
    Icon gboom7 = new ImageIcon("assets/gboom/boom-07.png");
    Icon gboom8 = new ImageIcon("assets/gboom/boom-08.png");
    Icon gboom9 = new ImageIcon("assets/gboom/boom-09.png");
    Icon gboom10 = new ImageIcon("assets/gboom/boom-10.png");
    Icon gboom11 = new ImageIcon("assets/gboom/boom-11.png");
    Icon gboom12 = new ImageIcon("assets/gboom/boom-12.png");
    Icon gboom13 = new ImageIcon("assets/gboom/boom-13.png");
    Icon gboom14 = new ImageIcon("assets/gboom/boom-14.png");
    Icon gboom15 = new ImageIcon("assets/gboom/boom-15.png");
    Icon gboom16 = new ImageIcon("assets/gboom/boom-16.png");
    Icon gboom17 = new ImageIcon("assets/gboom/boom-17.png");
    Icon gboom18 = new ImageIcon("assets/gboom/boom-18.png");
    Icon gboom19 = new ImageIcon("assets/gboom/boom-19.png");
    Icon gboom20 = new ImageIcon("assets/gboom/boom-20.png");

    private int temppoint;
    private int colors;
    private int appballs;
    private int dissballs;
    private Object o = null;

    // If there is a process of ball booming the booming is true, else it is false
    private boolean booming = false;

    boolean test = true;

    public synchronized void setTest(boolean test) {
        this.test = test;
    }

    public synchronized boolean isTest() {
        return test;
    }

    public Icon[] getBall() {
        return ball;
    }

    public JLabel[] getLabel() {
        return label;
    }

    public Icon getEmpty() {
        return empty;
    }

    public boolean isBooming() {
        return booming;
    }

    public void setBooming(boolean booming) {
        this.booming = booming;
    }

    private JButton button = new JButton();

    // The number of last pressed filled cell plus 1
    private int tmp = 0;

    private void start() {
        temppoint = 0;
        s.randfixstart(appballs);
        s.randfixcolorstart(colors);
    }

    private void startfill() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (s.getCboard()[i][j] == 1) {
                    ball[i * 9 + j] = blue;
                } else if (s.getCboard()[i][j] == 2) {
                    ball[i * 9 + j] = red;
                } else if (s.getCboard()[i][j] == 3) {
                    ball[i * 9 + j] = darkblue;
                } else if (s.getCboard()[i][j] == 4) {
                    ball[i * 9 + j] = yellow;
                } else if (s.getCboard()[i][j] == 5) {
                    ball[i * 9 + j] = green;
                } else if (s.getCboard()[i][j] == 6) {
                    ball[i * 9 + j] = magenta;
                } else {
                    ball[i * 9 + j] = empty;
                }

                label[i * 9 + j] = new JLabel();
                label[i * 9 + j].setIcon(ball[i * 9 + j]);
                label[i * 9 + j].addMouseListener(this);

                gridpanel.add(label[i * 9 + j]);
            }
        }
    }

    private void step(int hor, int ver) {
        s.disappear(dissballs);
        if (s.isDissapear()) {
            temppoint += PointCounter.pointCounter(s.getDiss(), s.getCboardbefore(), colors);
            points.setText(String.valueOf(temppoint));
            fillboom();
        } else {
            s.randfix(appballs);
            s.randfixcolor(colors);
            s.disappear(dissballs);
            if (s.isDissapear()) {
                temppoint += PointCounter.pointCounter(s.getDiss(), s.getCboardbefore(), colors);
                points.setText(String.valueOf(temppoint));
                fillboom();
            } else {
                fillboom();
            }
        }
    }

    private void fill() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (s.getCboard()[i][j] == 1) {
                    ball[i * 9 + j] = blue;
                } else if (s.getCboard()[i][j] == 2) {
                    ball[i * 9 + j] = red;
                } else if (s.getCboard()[i][j] == 3) {
                    ball[i * 9 + j] = darkblue;
                } else if (s.getCboard()[i][j] == 4) {
                    ball[i * 9 + j] = yellow;
                } else if (s.getCboard()[i][j] == 5) {
                    ball[i * 9 + j] = green;
                } else if (s.getCboard()[i][j] == 6) {
                    ball[i * 9 + j] = magenta;
                } else {
                    ball[i * 9 + j] = empty;
                }

                label[i * 9 + j].setIcon(ball[i * 9 + j]);
            }
        }

        validate();
    }

    private void fillboom() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (s.getCboard()[i][j] == 1 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(blue);
                } else if (s.getCboard()[i][j] == 2 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(red);
                } else if (s.getCboard()[i][j] == 3 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(darkblue);
                } else if (s.getCboard()[i][j] == 4 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(yellow);
                } else if (s.getCboard()[i][j] == 5 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(green);
                } else if (s.getCboard()[i][j] == 6 && (s.getDiss()[i][j] == 0)) {
                    label[i * 9 + j].setIcon(magenta);
                } else if (s.getCboardbefore()[i][j] == 1 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 1);
                } else if (s.getCboardbefore()[i][j] == 2 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 2);
                } else if (s.getCboardbefore()[i][j] == 3 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 3);
                } else if (s.getCboardbefore()[i][j] == 4 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 4);
                } else if (s.getCboardbefore()[i][j] == 5 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 5);
                } else if (s.getCboardbefore()[i][j] == 6 && (s.getDiss()[i][j] == -1)) {
                    new BoomAnimation(this, i, j, boomanimsleeptime, 6);
                } else {
                    label[i * 9 + j].setIcon(empty);
                }
            }
        }

        validate();
    }

    private void fillpath(int hor, int ver) {
        int[][] perc;
        perc = Pathpainter.finalshortestway(s.getPercolation(), hor, ver);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (perc[i][j] > 0) {
                    ball[i * 9 + j] = new ImageIcon("assets/path/path.gif");
                    label[i * 9 + j].removeAll();
                    label[i * 9 + j].setIcon(ball[i * 9 + j]);

                    validate();
                }
            }
        }

        validate();
    }

    public LFrame(int colors, int dissballs, int appballs) {

        // Starts the song
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;; i++) {
                    song.play();
                }
            }
        }).start();

        this.colors = colors;
        this.dissballs = dissballs;
        this.appballs = appballs;
        boomanimsleeptime = 20;
        s = new Setter(9);
        g = new GridLayout(9, 9, 1, 1);
        setJMenuBar(menubar);
        menubar.add(menu1);

        item1_1.addActionListener(this);
        item1_2.addActionListener(this);
        item1_3.addActionListener(this);
        item1.add(item1_1);
        item1.add(item1_2);
        item1.add(item1_3);
        menu1.add(item1);

        item10.addActionListener(this);

        menu1.addSeparator();
        menu1.add(item10);
        start();
        startfill();
        button.addActionListener(this);
        button.setText("refresh");
        busy.setText(String.valueOf(s.getBusy()));
        points.setText(String.valueOf(0));
        linescorptext.setText("Copyright(c) 2015 aragasparyan.com. All rights reserved");
        linescorptext.setPreferredSize(new Dimension(10, 25));

        panelatributes.setLayout(new BorderLayout());
        panelatributes.add(busy, BorderLayout.WEST);
        panelatributes.add(points, BorderLayout.EAST);

        panellinescorp.setLayout(new BorderLayout());
        panellinescorp.add(linescorptext);

        gridpanel.setBackground(Color.black);
        gridpanel.setLayout(g);
        setLayout(null);
        mainpanel.setLayout(new BorderLayout());
        mainpanel.add(gridpanel, BorderLayout.CENTER);
        mainpanel.add(panelatributes, BorderLayout.NORTH);
        mainpanel.add(panellinescorp, BorderLayout.SOUTH);

        basicpanel.setLayout(new BorderLayout());
        basicpanel.add(mainpanel);
        basicpanel.setBounds(170, 10, 460, 500);
        add(basicpanel);
        add(rightpanel);
        add(leftpanel);

        setResizable(false);
        setLocation(350, 100);
        setSize(800, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1_1) {
            this.colors = 5;
            this.dissballs = 4;
            this.appballs = 3;
            s = new Setter(9);
            busy.setText(String.valueOf(s.getBusy()));
            points.setText(String.valueOf(0));

            start();
            fill();
            validate();
        } else if (e.getSource() == item1_2) {
            this.colors = 6;
            this.dissballs = 5;
            this.appballs = 3;
            s = new Setter(9);
            busy.setText(String.valueOf(s.getBusy()));
            points.setText(String.valueOf(0));

            start();
            fill();
            validate();
        } else if (e.getSource() == item1_3) {
            this.colors = 6;
            this.dissballs = 6;
            this.appballs = 4;
            s = new Setter(9);
            busy.setText(String.valueOf(s.getBusy()));
            points.setText(String.valueOf(0));

            start();
            fill();
            validate();
        } else if (e.getSource() == item1) {
            this.colors = 6;
            this.dissballs = 5;
            this.appballs = 3;
            s = new Setter(9);
            busy.setText(String.valueOf(s.getBusy()));
            points.setText(String.valueOf(0));

            start();
            fill();
            validate();
        } else if (e.getSource() == item10) {

            System.exit(0);

        } else if (e.getSource() == button) {

            new BoomAnimation(this, 1, 0, boomanimsleeptime, 5);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.gc();
        if (!booming) {

            for (int k = 0; k < 81; k++) {
                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 1)) {
                    fill();
                    label[k].setIcon(mblue);
                    tmp = k + 1;
                    validate();
                    break;
                }

                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 2)) {
                    fill();
                    label[k].setIcon(mred);
                    tmp = k + 1;
                    validate();
                    break;
                }

                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 3)) {
                    fill();
                    label[k].setIcon(mdarkblue);
                    tmp = k + 1;
                    validate();
                    break;
                }

                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 4)) {
                    fill();
                    label[k].setIcon(myellow);
                    tmp = k + 1;
                    validate();
                    break;
                }

                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 5)) {
                    fill();
                    label[k].setIcon(mgreen);
                    tmp = k + 1;
                    validate();
                    break;
                }

                if ((e.getSource() == label[k]) && (s.getCboard()[k / 9][k % 9] == 6)) {
                    fill();
                    label[k].setIcon(mmagenta);
                    tmp = k + 1;
                    validate();
                    break;
                }
                validate();

            }

            o = e.getSource();
            new PathAnimation(this);

            validate();

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public synchronized void superstep1() {
        for (int k = 0; k < 81; k++) {
            if ((o == label[k]) && (s.getCboard()[k / 9][k % 9] == 0) && (tmp > 0)) {
                s.findway((tmp - 1) / 9, (tmp - 1) % 9, k / 9, k % 9);

                if (s.isWay()) {

                    int m = 0;
                    s.getBoard()[(tmp - 1) / 9][(tmp - 1) % 9] = 0;
                    m = s.getCboard()[(tmp - 1) / 9][(tmp - 1) % 9];
                    s.getCboard()[(tmp - 1) / 9][(tmp - 1) % 9] = 0;
                    s.getBoard()[k / 9][k % 9] = 1;
                    s.getCboard()[k / 9][k % 9] = m;

                    fillpath(k / 9, k % 9);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    step(k / 9, k % 9);

                    busy.setText(String.valueOf(s.getBusy()));
                    test = true;
                    validate();

                }

                validate();
                break;
            }
        }

        if (s.getBusy() == 81) {
            JOptionPane.showMessageDialog(null, "Game over");
        }
    }
}
