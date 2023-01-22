package ch02.P2_12;

import javax.swing.*;

public class LineDistanceTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("Practice 2.12");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        LineAndPointComponent lineComponent = new LineAndPointComponent();
        frame.add(lineComponent);
    }
}
