package Graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Exercise_4 {
    public static void main(String[] args) {
        JFrame p = new JFrame("Animation");
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing D = new Drawing();
        p.add(D);
      
        p.setSize(640,480);
        p.setVisible(true);
    }
    
}
class Drawing extends JPanel implements ActionListener{
    
    int circlex,circley;
    int gravity = 10;
    Timer delay;
    public Drawing() {
        delay = new Timer(30,this);
        delay.start();
        circlex = 100;
        circley = 10;
        

    }
    
    public void paintComponent(Graphics gp){
        super.paintComponent(gp);
        gp.setColor(Color.BLUE);
        gp.fillOval(circlex, circley, 100, 100);
        circlex += gravity;
        circley += gravity;
        
    }
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
}