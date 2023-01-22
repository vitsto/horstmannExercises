package ch02.Ex2_19;

import javax.swing.*;

public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(200, 200);
        jFrame.setTitle("Exercise 2.19");

        TwoSquareComponent component = new TwoSquareComponent();
        jFrame.add(component);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
