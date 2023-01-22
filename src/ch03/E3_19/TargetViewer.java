package ch03.E3_19;

import javax.swing.*;

public class TargetViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 3.19");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        TargetComponent component = new TargetComponent();
        frame.add(component);

    }
}
