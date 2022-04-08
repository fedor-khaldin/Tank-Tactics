package src.fedorArchive;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.Image;
import java.awt.Graphics;

public class mainCode extends JPanel {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TANK MOVEMENT");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


        JPanel panel = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img = Toolkit.getDefaultToolkit().getImage("tank.jpeg");
                g.drawImage(img, 0, 0, this);

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                g.drawImage(img, 4, 0, this);
                
            }
        };

        

        frame.add(panel);

        frame.setVisible(true);
        
        
        
    }
  }
    
   

