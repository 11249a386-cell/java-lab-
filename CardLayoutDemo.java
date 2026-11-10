import java.applet.Applet;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends Applet implements ActionListener {
    private CardLayout cardLayout;
    private Panel cardPanel;

    public void init() {
        setLayout(new java.awt.BorderLayout());

        cardPanel = new Panel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        Button first = new Button("First Button - Click to Next");
        Button second = new Button("Second Button - Click to Next");
        Button third = new Button("Third Button - Click to Next");

        first.addActionListener(this);
        second.addActionListener(this);
        third.addActionListener(this);

        cardPanel.add(first, "first");
        cardPanel.add(second, "second");
        cardPanel.add(third, "third");

        add(cardPanel, java.awt.BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        cardLayout.next(cardPanel);
    }
}
