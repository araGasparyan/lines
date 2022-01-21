/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ara
 */
public class LPanel extends JPanel {

    JLabel label1 = new JLabel();
    Icon test2 = new ImageIcon("assets/leftpanel/left.png");

    public LPanel() {
        setLayout(null);
        setBounds(2, 27, 200, 458);

        label1.setIcon(test2);
        label1.setBounds(10, 0, 500, 450);
        add(label1);
    }
}
