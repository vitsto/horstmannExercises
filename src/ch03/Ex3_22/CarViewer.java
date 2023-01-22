package ch03.Ex3_22;

import javax.swing.*;

public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setTitle("Exercise 3.23");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent component = new CarComponent();
        frame.add(component);
    }
}
