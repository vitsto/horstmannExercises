package ch02.Ex2_21;

import javax.swing.*;

public class NameViewer {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(200, 200);
        jFrame.setTitle("Exercise 2.21");

        NameComponent component = new NameComponent();
        jFrame.add(component);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
