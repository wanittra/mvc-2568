package View;

import Controller.*;
import javax.swing.*;
import java.awt.*;

public class HeroSuitView extends JFrame {
    @SuppressWarnings("unused")
    private HeroSuitController controller;

    public HeroSuitView(HeroSuitController controller) {
        this.controller = controller;
        setTitle("Hero Suit System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        add(new InputView(controller), BorderLayout.NORTH);
        add(new RepairView(controller), BorderLayout.CENTER);
    }
}











