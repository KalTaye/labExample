package Graphic;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class myExercise extends JPanel{
    public void paintComponent(Graphics gr){
        gr.setColor(Color.BLUE);
        gr.drawString("MY Drawings", 20, 20);
        gr.drawRect(40, 40, 150, 100);
        gr.fillRect(60, 180, 60, 60);
        gr.drawOval(350, 40, 200, 100);
        gr.fillOval(350, 160, 50, 50);
    }
    
}

public class Exercise_1 {
    public static void main(String[] args) {
        JFrame draw = new JFrame("Exercise_1");
        draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myExercise m = new myExercise();
        draw.add(m);
        draw.setSize(700,600);
        draw.setVisible(true);
    }
}
