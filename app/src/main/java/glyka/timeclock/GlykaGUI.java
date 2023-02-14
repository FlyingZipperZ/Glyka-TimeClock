package glyka.timeclock;

import javax.swing.*;
import java.awt.*;

import static glyka.timeclock.Panels.LoginPanel.loginPanel;

public class GlykaGUI extends JFrame {
    public GlykaGUI() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        JLabel topLabel = new JLabel("Glyka Sweets");
        topLabel.setFont(new Font("Droid Sans Mono", Font.PLAIN, 25));

        // Main Constraints that move everything around
        GridBagConstraints mainConstraints = new GridBagConstraints();
        mainConstraints.anchor = GridBagConstraints.NORTH;
        mainConstraints.insets = new Insets(10, 10, 10, 10);
        mainConstraints.gridx = 0;
        mainConstraints.gridy = 0;
        mainConstraints.gridwidth = 3;

        mainPanel.add(topLabel, mainConstraints);

        Object[] obj1 = {"Odysseas", "Fourakis", 40};

        mainConstraints.insets = new Insets(20, 30, 20, 30);
        mainConstraints.gridx = 0;
        mainConstraints.gridy = 1;
        mainConstraints.gridwidth = 1;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 1;
        mainConstraints.gridy = 1;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 2;
        mainConstraints.gridy = 1;
        mainPanel.add(loginPanel(), mainConstraints);

        mainConstraints.gridx = 0;
        mainConstraints.gridy = 2;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 1;
        mainConstraints.gridy = 2;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 2;
        mainConstraints.gridy = 2;
        mainPanel.add(loginPanel(), mainConstraints);

        mainConstraints.gridx = 0;
        mainConstraints.gridy = 3;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 1;
        mainConstraints.gridy = 3;
        mainPanel.add(loginPanel(), mainConstraints);
        mainConstraints.gridx = 2;
        mainConstraints.gridy = 3;
        mainPanel.add(loginPanel(), mainConstraints);

        setMinimumSize(new Dimension(600, 400));
        setMaximumSize(new Dimension(600, 400));
        add(mainPanel);
    }
}
