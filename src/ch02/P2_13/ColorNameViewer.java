package ch02.P2_13;

import javax.swing.*;

public class ColorNameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Practice 2.13");

        ColorNameComponent component = new ColorNameComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
