package com.sqq.annotation14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: sunqianqian
 * @Description:
 * @CodeReviewer:
 */
public class OKListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "you click ok");
    }
}
