package ch02.P2_5;

import javax.swing.*;
import java.awt.*;

public class TranslateDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Rectangle rectangle = new Rectangle(100, 100, 300, 200);
        frame.setBounds(rectangle);

        JOptionPane.showMessageDialog(frame,"Click OK to continue");

        rectangle.translate(200,200);
        frame.setBounds(rectangle);
    }
}
