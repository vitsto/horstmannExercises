package ch02;

import javax.swing.*;
import java.awt.*;

public class BrighterDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(200,200);
        Color myColor = new Color(50, 100, 150);
        jFrame.getContentPane().setBackground(myColor);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}
