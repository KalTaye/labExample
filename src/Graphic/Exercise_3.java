package Graphic;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise_3 {
    public static void main(String[] args) {
      JFrame  drw = new JFrame("Chess Board");
      drw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Paint p = new Paint();
      drw.add(p);
      
      drw.setSize(640,480);
      drw.setVisible(true);
    }
  
}
class Paint extends JPanel{
    public void paintComponent(Graphics g){
         int xrect = 0 ;
         int yrect = 0 ;
         int p =8;
        
         
            
        
         for (int i=4;i>0;i--){
             
             for(int j = 0 ; j<i ; j++){
                g.setColor(Color.BLACK);
                g.fillRect(xrect, yrect, 100, 100);
                xrect = xrect+100;
                g.setColor(Color.WHITE);
                g.fillRect(xrect, yrect, 100, 100);
                xrect = xrect+100;
                
            
             }
             yrect += 100;
               
         }   
         }
        
}    

