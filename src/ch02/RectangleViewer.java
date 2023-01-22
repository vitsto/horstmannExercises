package ch02;

import javax.swing.*;

public class RectangleViewer {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(300,400);
        jFrame.setTitle("Two rectangles");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent component = new RectangleComponent();
        jFrame.add(component);

        jFrame.setVisible(true);
    }
}
