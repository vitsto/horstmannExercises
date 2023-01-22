package ch02.P2_13;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorNameComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            graphics2D.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            graphics2D.drawString("Столяров Виталий Яварович", 100, 100 + i * 10);
        }
    }
}
