package src.fedorArchive;

// Java program to illustrate the GridLayout
import java.awt.*;
import javax.swing.*;
  
// create a class griddemo
public class Griddemo {
  
// Main Method
public static void main(String[] args)
{
    Icon icon = new ImageIcon("backing1.png");
    Icon icon2 = new ImageIcon("backing2.png");
    // Creating Object of JFrame class 
    // with new name frame
    JFrame frame = new JFrame("GridLayout Demo");

    
  
    // Initialization of object 
    // "btn1" of JButton class.
    JButton btn1 = new JButton("");
    btn1.setIcon(icon);
    
  
    // Initialization of object 
    // "btn2" of JButton class.
    JButton btn2 = new JButton("Button 2");
    btn2.setIcon(icon2);

    // Initialization of object 
    // "btn3" of JButton class.
    JButton btn3 = new JButton("Button 3");
    btn3.setIcon(icon2);
  
    // Initialization of object
    // "btn4" of JButton class.
    JButton btn4 = new JButton("Button 4");
    btn4.setIcon(icon);

    // Initialization of object 
    // "btn5" of JButton class.
    JButton btn5 = new JButton("Button 5");
    btn5.setIcon(icon);

    JButton btn6 = new JButton("Button 5");
    btn6.setIcon(icon2);

    // Creating Object Panel of JPanel class
    JPanel panel = new JPanel(new GridLayout(3, 3, 0, 0));
  
    // Adding JButton "btn1" on JPanel.
    panel.add(btn1);
    
  
    // Adding JButton "btn2" on JPanel.
    panel.add(btn2);
  
    // Adding JButton "btn3" on JPanel.
    panel.add(btn3);
  
    // Adding JButton "btn4" on JPanel.
    panel.add(btn4);
  
    // Adding JButton "btn5" on JPanel.
    panel.add(btn5);

    panel.add(btn6);
    

  
    // Function to close the operation of JFrame.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    // Function to set size of JFrame.
    frame.setSize(300, 450);
    frame.setResizable(false);
  
    // Function to get the content of JFrame.
    frame.getContentPane().add(panel);
  
    // Function to set visible status of JFrame.
    frame.setVisible(true);
}
}