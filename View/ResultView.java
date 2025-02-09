package View;

import java.awt.Color;

import javax.swing.*;

public class ResultView extends JFrame {
    public ResultView(String message, boolean isSuccess) {
        setTitle("Result");
        setSize(500, 350);
        setLocationRelativeTo(null);

        JLabel resultLabel = new JLabel(message);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        if (isSuccess) {
            resultLabel.setForeground(Color.GREEN);
        } else {
            resultLabel.setForeground(Color.RED);
        }

        add(resultLabel);
        setVisible(true);
    }
}








