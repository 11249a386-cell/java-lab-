import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Insets;
import java.awt.TextArea;

public class BorderLayoutDemo extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("This is across the top"), BorderLayout.NORTH);
        add(new Button("The footer message might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String message = "The reasonable man adapts himself to the world.";
        add(new TextArea(message), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}
