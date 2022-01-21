/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

/**
 *
 * @author Ara
 */
public class PathAnimation implements Runnable {

    LFrame l;
    Thread t;

    PathAnimation(LFrame l) {
        this.l = l;
        t = new Thread(this);
        t.start();
        System.out.println(t.toString());
    }

    @Override
    public void run() {
        l.superstep1();
    }

}
