import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Insets;

public class GridLayoutDemo extends Applet {
    public void init() {
        setLayout(new GridLayout(5, 2));

        for (char ch = 'A'; ch <= 'J'; ch++) {
            add(new Button(String.valueOf(ch)));
        }
    }

    public Insets getInsets() {
        return new Insets(20, 20, 20, 20);
    }
}
