package com.company.java9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Test extends JFrame{
    private final Circle circle = new Circle();
    private final Rectangle rectangle = new Rectangle();
    private final Triangle triangle = new Triangle();

    public Test() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton button = new JButton("Generate shapes!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Shapes");
                frame.setBounds(100,100,1200,700);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new MyComponent());
                frame.setVisible(true);
            }
        });
        container.add(button);
        setSize(400, 350);
        setVisible(true);
    }

    public Shape randShape() {
        Random random = new Random();

        return switch (random.nextInt(3)) {
            case 0 -> circle;
            case 1 -> rectangle;
            case 2 -> triangle;
            default -> null;
        };
    }
    class MyComponent extends JComponent {
        public void paint(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < 20; i++) {
                Shape shape = randShape();
                shape.draw(g);
            }
            setVisible(true);
        }
    }
}
