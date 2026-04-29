package zd_java_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class f_jtextfield extends JFrame {
    f_jtextfield() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextField jtf = new JTextField(10);    // creating a text field with 10 columns
        add(jtf);   // adding JTextField to frame.
        setVisible(true);
    }

    public static void main(String[] args) {
        new f_jtextfield();
    }
}