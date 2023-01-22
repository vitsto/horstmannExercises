package ch03.E3_19;

import javax.swing.*;
import java.awt.*;

public class TargetComponent extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Target target = new Target(Math.min(getWidth(), getHeight()) / 2, getWidth() / 2, getHeight() / 2);
        target.draw(g2);
    }
}
