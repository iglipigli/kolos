package org.example;

import java.awt.*;
import java.util.ArrayList;

public class RunnablePaint implements Runnable{
    public ArrayList<Rectangle> lista;
    public Graphics g;

    RunnablePaint(ArrayList<Rectangle> lista, Graphics g){
        this.lista = lista;
        this.g = g;
    }
    @Override
    public void run(){
        try {
            for (int i = 0; i < lista.size(); i++) {
                lista.get(i).paintComponent(g);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
