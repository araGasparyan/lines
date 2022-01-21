/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ara Gasparyan
 */
public class BoomAnimation implements Runnable {

    private final Thread t;
    private LFrame l;
    private int i, j;
    int sleeptime;
    int colorid;

    public BoomAnimation(LFrame l, int i, int j, int sleeptime, int colorid) {
        this.l = l;
        this.i = i;
        this.j = j;
        this.sleeptime = sleeptime;
        this.colorid = colorid;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        l.setBooming(true);
        switch (colorid) {
            case 1:
                l.getLabel()[i * 9 + j].setIcon(l.bboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.bboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 2:
                l.getLabel()[i * 9 + j].setIcon(l.rboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.rboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 3:
                l.getLabel()[i * 9 + j].setIcon(l.dbboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.dbboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 4:
                l.getLabel()[i * 9 + j].setIcon(l.yboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.yboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 5:
                l.getLabel()[i * 9 + j].setIcon(l.gboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.gboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 6:
                l.getLabel()[i * 9 + j].setIcon(l.mboom1);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom2);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom3);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom4);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom5);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom6);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom7);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom8);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom9);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom10);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom11);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom12);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom13);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom14);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom15);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom16);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom17);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom18);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom19);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }

                l.getLabel()[i * 9 + j].setIcon(l.mboom20);
                try {
                    Thread.sleep(sleeptime);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoomAnimation.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                System.out.println("Something is wrong");
        }
        l.getLabel()[i * 9 + j].setIcon(l.getEmpty());

        l.setBooming(false);

    }

}
