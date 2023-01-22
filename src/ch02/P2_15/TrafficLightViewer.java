package ch02.P2_15;

import javax.swing.*;

public class TrafficLightViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Practice 2.15");

        TrafficLightComponent component = new TrafficLightComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
