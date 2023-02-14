package glyka.timeclock.Panels;

import javax.swing.*;
import java.awt.*;

public class LoginPanel {
    public static JPanel loginPanel() {

        JPanel newPanel = new JPanel();
        JButton button1 = new JButton("Odysseas");
        button1.setBackground(Color.CYAN);
        button1.setBackground(Color.CYAN);
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        newPanel.add(button1);

        return newPanel;
    }
}
