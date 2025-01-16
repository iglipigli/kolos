package org.example;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame("Kolos");
        okno.setPreferredSize(new Dimension(800,600));
        okno.setVisible(true);
        Panel panel = new Panel();
        okno.add(panel);
        okno.pack();
    }
}