package oopc15.ue1.GUI;

import java.awt.Component; import java.awt.Color; import java.awt.Graphics; import java.awt.Graphics2D; import java.util.Random;
public class DrawingComponents extends Component{
    public void paint (Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g.setColor(Color.BLACK);
        for (int i = 0; i <1000 ; i+=20) {
            for (int j = 0; j <600 ; j+=20) {
                g.drawLine(i,j,i,j);
            }

        }

    }


}
