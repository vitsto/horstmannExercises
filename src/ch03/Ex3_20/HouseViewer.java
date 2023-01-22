package ch03.Ex3_20;

import javax.swing.*;

public class HouseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 3.20");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        HouseComponent component = new HouseComponent();
        frame.add(component);

    }
}
