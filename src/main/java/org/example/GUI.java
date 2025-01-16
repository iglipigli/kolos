package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GUI extends JPanel {
    int x,y;
    int sizex,sizey;

    JButton button;
    JTextField posY;
    JTextField posX;
    JTextField sizeX;
    JTextField sizeY;

    ArrayList<Rectangle> lista = new ArrayList<Rectangle>();
    GUI(){
        //DANE
        this.setLayout(new FlowLayout());
        button = new JButton();
        posY = new JTextField();
        posX = new JTextField();
        sizeY = new JTextField();
        sizeX = new JTextField();
        Thread rectangleThread = new Thread();

        //guzik
        button.setSize(50,100);
        button.setText("Dodaj");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                AddRectangle(Integer.parseInt(posX.getText()),Integer.parseInt(posY.getText()),Integer.parseInt(sizeX.getText()),Integer.parseInt(sizeY.getText()));
                System.out.println("test");
            }
        });
        //posY
        posY.setPreferredSize(new Dimension(50,25));
        //posY
        posX.setPreferredSize(new Dimension(50,25));
        //posX
        sizeY.setPreferredSize(new Dimension(50,25));
        //posX
        sizeX.setPreferredSize(new Dimension(50,25));
        //posX
        this.add(button);
        this.add(posX);
        this.add(posY);
        this.add(sizeX);
        this.add(sizeY);
    }

    private void AddRectangle(int x, int y, int sizeX, int sizeY) {
        //dodać checki czy dane są poprawne
        lista.add(new Rectangle(x,y,sizeX,sizeY));
    }

    @Override
    protected void paintComponent(Graphics g){
        try {
            for (int i = 0; i < lista.size(); i++) {
                lista.get(i).paintComponent(g);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
