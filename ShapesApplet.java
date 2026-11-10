import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        // Rectangle
        g.setColor(Color.BLUE);
        g.drawRect(40, 50, 120, 70);
        g.drawString("Rectangle", 65, 140);

        // Filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(210, 50, 120, 70);
        g.setColor(Color.BLACK);
        g.drawString("Filled Rectangle", 215, 140);

        // Line
        g.setColor(Color.RED);
        g.drawLine(40, 190, 160, 190);
        g.setColor(Color.BLACK);
        g.drawString("Line", 85, 210);

        // Circle
        g.setColor(Color.MAGENTA);
        g.drawOval(220, 165, 90, 90);
        g.setColor(Color.BLACK);
        g.drawString("Circle", 245, 270);

        // Oval
        g.setColor(Color.ORANGE);
        g.drawOval(55, 230, 110, 55);
        g.setColor(Color.BLACK);
        g.drawString("Oval", 95, 305);

        // Title
        g.drawString("Drawing Shapes Using Java Applet", 85, 25);
    }
}
