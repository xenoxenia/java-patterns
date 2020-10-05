package com.company.java8Shapes;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public static void main(String[] args){
        JFrame window = new JFrame("Окошечко");
        window.setSize(800, 800);
        window.setLayout(new BorderLayout(1, 1));
        Together together = new Together();
        together.together();
        window.setVisible(true);
        window.add(together).setVisible(true);
    }
}
