package View;
import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RepairView extends JPanel {
    private HeroSuitController controller;
    private JTextArea repairedSuitsArea;

    public RepairView(HeroSuitController controller) {
        this.controller = controller;
        setLayout(new BorderLayout());

        JButton refreshButton = new JButton("Refresh Repairs");
        repairedSuitsArea = new JTextArea();
        repairedSuitsArea.setEditable(false);

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRepairedSuitsArea();
            }
        });

        add(new JScrollPane(repairedSuitsArea), BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);
    }

    private void updateRepairedSuitsArea() {
        List<HeroSuit> repairedSuits = controller.getRepairedSuits();
        repairedSuitsArea.setText("");
        for (HeroSuit suit : repairedSuits) {
            repairedSuitsArea.append(suit.toString() + "\n");
        }
    }
}










