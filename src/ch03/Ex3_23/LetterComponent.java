package ch03.Ex3_23;

import ch03.Car;

import javax.swing.*;
import java.awt.*;

public class LetterComponent extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        LetterH h = new LetterH(10, 10, Color.RED);
        LetterE e = new LetterE(40, 10, Color.RED);
        LetterL l1 = new LetterL(70, 10, Color.RED);
        LetterL l2 = new LetterL(100, 10, Color.RED);
        LetterO o = new LetterO(130, 10, Color.RED);


        h.draw(g2);
        e.draw(g2);
        l1.draw(g2);
        l2.draw(g2);
        o.draw(g2);
    }
}
