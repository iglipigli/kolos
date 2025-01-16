package org.example;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    GUI gui;
    Panel(){
        gui = new GUI();
        this.add(gui);
        gui.setLocation(200,650);

        Thread update = new Thread(new Runnable(){

            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(60/1000);
                        repaint();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        update.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        gui.paintComponent(g);
    }
}
