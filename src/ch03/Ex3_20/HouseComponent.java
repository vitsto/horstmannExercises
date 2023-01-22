package ch03.Ex3_20;

import ch03.E3_19.Target;

import javax.swing.*;
import java.awt.*;

public class HouseComponent extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        House house1 = new House(100,100,150, 200);
        house1.draw(g2);

        House house2 = new House(25,25,75, 100);
        house2.draw(g2);

        House house3 = new House(280,250,50, 70);
        house3.draw(g2);
    }
}
