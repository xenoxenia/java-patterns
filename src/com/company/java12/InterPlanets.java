package com.company.java12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.*;

public class InterPlanets extends JFrame{

        private static final double gravConst = 6.67 * Math.pow(10, -11);
        private NumberFormat formatter = new DecimalFormat("#0.00000");

        public InterPlanets() {
            super("Solar System Planets");
            this.setBounds(400, 200, 600, 400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = getContentPane();
            container.setLayout(new GridLayout(3, 2, 2, 2));
            container.setBackground(new Color(57, 39, 80));

            PlanetsK[] planets = PlanetsK.values();
            for (PlanetsK p : planets) {
                JButton button = new JButton(String.valueOf(p));
                button.addActionListener(e -> {
                    String message = "";
                    double grav = gravConst * p.getMass() / (p.getRadius() * p.getRadius() * Math.pow(10, 6));
                    message += "Gravitation on " + p + " is " + grav;
                    JOptionPane.showMessageDialog(null,
                            message,
                            "Output",
                            JOptionPane.PLAIN_MESSAGE);
                });
                button.setForeground(new Color(123, 104, 238));
                container.add(button);
            }
        }
}