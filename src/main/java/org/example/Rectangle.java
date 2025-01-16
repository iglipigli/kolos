package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Rectangle extends JComponent implements KeyListener, MouseListener {
    int posX,posY;
    int sizeX,sizeY;
    Point mouseLast;

    boolean mousePressed = false;

    Rectangle(int x, int y, int sizeX,int sizeY){
        this.posX = x;
        this.posY = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        RecalculateBounds();
        this.setFocusable(true);
        addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(posX,posY,sizeX,sizeY);
    }
    private void RecalculateBounds(){
        this.setBounds(posX,posY,sizeX,sizeY);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.print("fired");
        if(e.getButton() == MouseEvent.BUTTON1){
            System.out.print("fired");
            if(!mousePressed){
                mousePressed = true;
                mouseLast = new Point(e.getX(),e.getY());
                return;
            }
            Point mouseDelta = new Point(e.getX()-mouseLast.x,e.getY()-mouseLast.y);
            posX += mouseDelta.x;
            posY += mouseDelta.y;
            mouseLast = new Point(e.getX(),e.getY());
            RecalculateBounds();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mousePressed = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
