/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matenadaran
 */
class Animation implements Runnable {
    Thread t;
    LFrame l;

    Animation(LFrame l) {
        this.l = l;

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        l.setBooming(true);
        System.out.println(l.isBooming());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
        }

        l.setBooming(false);
        System.out.println(l.isBooming());
    }
}
