package ch03;

import javax.swing.*;

public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent component = new CarComponent();
        frame.add(component);
    }
}
