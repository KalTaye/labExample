package Graphic;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class DrawingPanel extends JPanel implements ActionListener , KeyListener{
    
    int circlex,circley,rectx;
    int diameter;
    int gravity = 10;
    Timer delay;
    public DrawingPanel() {
        delay = new Timer(30,this);
        delay.start();
        circlex = 100;
        circley = 10;
        rectx = 640 ;
        
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        doDrawing(g);
    }
    
    private void doDrawing(Graphics g){
        g.fillOval(circlex, circley, 100, 100);
        g.fillRect(rectx, 0, 50, 200);
        circley += gravity ; 
        rectx -= 10 ; 
    } 

    
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

   
    public void keyTyped(KeyEvent ke) {
        
    }

    
    public void keyPressed(KeyEvent ke) {
        gravity -= 10;
    }

   
    public void keyReleased(KeyEvent ke) {
       gravity = 10 ;
    }

}
public class GraphicExample_1 {
    public static void main(String[] args) {
        JFrame  myWindow= new JFrame("My first window");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPanel  myDrawing = new DrawingPanel();
        myWindow.addKeyListener(myDrawing);
        myWindow.add(myDrawing);
        myWindow.setSize(640,480);
        myWindow.setVisible(true);
        
        
    }
}
