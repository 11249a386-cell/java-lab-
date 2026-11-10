import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HumanFaceApplet extends Applet {
    public void paint(Graphics g) {
        // Face
        g.setColor(new Color(255, 220, 177));
        g.fillOval(100, 40, 200, 230);
        g.setColor(Color.BLACK);
        g.drawOval(100, 40, 200, 230);

        // Hair
        g.setColor(Color.BLACK);
        g.fillArc(100, 25, 200, 110, 0, 180);

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(145, 115, 35, 25);
        g.fillOval(220, 115, 35, 25);
        g.setColor(Color.BLACK);
        g.fillOval(158, 122, 12, 12);
        g.fillOval(233, 122, 12, 12);

        // Nose
        g.drawLine(200, 140, 185, 185);
        g.drawLine(185, 185, 205, 185);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(165, 185, 75, 40, 180, 180);

        // Ears
        g.setColor(new Color(255, 220, 177));
        g.fillOval(85, 125, 25, 55);
        g.fillOval(290, 125, 25, 55);
        g.setColor(Color.BLACK);
        g.drawOval(85, 125, 25, 55);
        g.drawOval(290, 125, 25, 55);

        // Title
        g.drawString("Human Face Using Java Applet", 105, 310);
    }
}
