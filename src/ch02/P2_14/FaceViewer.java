package ch02.P2_14;

import javax.swing.*;

public class FaceViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Practice 2.14");

        FaceComponent component = new FaceComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
