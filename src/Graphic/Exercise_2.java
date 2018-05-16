package Graphic;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Exercise_2 {
    public static void main(String[] args) {
        JFrame  drw = new JFrame();
        drw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       Draw D = new Draw();
       drw.add(D);
       drw.setSize(640,480);
       drw.setVisible(true);
    }
}
class Draw extends JPanel{
      public void paintComponent(Graphics g){
          g.setColor(Color.BLUE);
          int yaxis = 30;
          int x =80;
          for (int i = 0; i < 4; i++) {
              g.drawRect(30, yaxis,x, 30);
              x = x-20;
              yaxis = yaxis + 30;
          }
 
      }
    
}