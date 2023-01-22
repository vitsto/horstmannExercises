package ch02;

import javax.swing.*;

public class FaceViewer {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(150,250);
        jFrame.setTitle("An Alien Face");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent component = new FaceComponent();
        jFrame.add(component);

        jFrame.setVisible(true);
    }
}
