package glyka.timeclock;

import javax.swing.*;
import java.awt.*;

public class GlykaGUI extends JFrame {
    public GlykaGUI() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        JLabel topLabel = new JLabel("Glyka Sweets");

        // Main Constraints that move everything around
        GridBagConstraints mainConstraints = new GridBagConstraints();
        mainConstraints.anchor = GridBagConstraints.CENTER;
        mainConstraints.insets = new Insets(10, 10, 10, 10);
        mainConstraints.gridx = 0;
        mainConstraints.gridy = 1;

        mainPanel.add(topLabel, mainConstraints);

        setMinimumSize(new Dimension(500, 300));
        setMaximumSize(new Dimension(600, 400));
        add(mainPanel);
    }
}
