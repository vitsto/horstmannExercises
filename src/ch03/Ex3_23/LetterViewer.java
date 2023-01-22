package ch03.Ex3_23;

import javax.swing.*;

public class LetterViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setTitle("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LetterComponent component = new LetterComponent();
        frame.add(component);
    }
}
