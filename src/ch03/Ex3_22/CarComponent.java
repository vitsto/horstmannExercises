package ch03.Ex3_22;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Car car1 = new Car(0,0, Color.RED);

        int x = getWidth() - 60;
        int y = getHeight() -30;

        Car car2 = new Car(x,y, Color.YELLOW);

        car1.draw(g2);
        car2.draw(g2);
    }
}
