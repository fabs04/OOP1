package oopc15.ue1.GUI;
import oopc15.ue1.interfaces.IPoint;

import javax.swing.*;
import java.awt.*;

public class GUI implements IPoint{
    private static double x;
    private double y;
    public static void main(String[] args) {

        Runnable guiCreator = new Runnable(){
            public void run(){
                JFrame fenster =new JFrame("Hello World mit Swing");
                fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel ("Hello World");
                fenster.add(label);
                fenster.setSize(1000,600);
                fenster.getContentPane().add(new DrawingComponents());
                fenster.setVisible(true);
                while(x<500){
                    fenster.revalidate();
                    x++;
                }
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
