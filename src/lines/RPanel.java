/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lines;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ara Gasparyan
 */
public class RPanel extends JPanel {
    JLabel label;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel;

    public RPanel() {
        initComponents();
        label = jLabel;
        setBounds(636, 27, 155, 458);

        add(label);
    }

    private void initComponents() {
        jPanel = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();

        jPanel.setPreferredSize(new java.awt.Dimension(155, 458));
        jPanel.setRequestFocusEnabled(false);

        jLabel.setIcon(new javax.swing.ImageIcon("assets/rightpanel/right.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel)
                                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel)
                                .addContainerGap(306, Short.MAX_VALUE))
        );

    }

}
