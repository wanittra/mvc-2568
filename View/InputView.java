package View;

import Controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputView extends JPanel {
    private JTextField suitIdField;
    private JButton submitButton;
    private HeroSuitController controller;

    public InputView(HeroSuitController controller) {
        this.controller = controller;
        setLayout(new GridLayout(3, 1, 5, 5));

        JLabel instructionLabel = new JLabel("Enter Hero Suit ID:");
        suitIdField = new JTextField();
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new SubmitButtonListener());

        add(instructionLabel);
        add(suitIdField);
        add(submitButton);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String suitId = suitIdField.getText().trim();
            String resultMessage = controller.validateSuitId(suitId);
            boolean isSuccess = resultMessage.startsWith("Hero Suit Found");
            new ResultView(resultMessage, isSuccess);
        }
    }
}










