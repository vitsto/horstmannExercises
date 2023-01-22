package ch03.E3_18;

import javax.swing.*;

public class EllipseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 2.18");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        EllipseComponent component = new EllipseComponent();
        frame.add(component);
    }
}
