package bca6sem;

//import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class BorderLayoutCalculator   {
 
public static void main(String[] args) {
{
    JPanel windowContent = new JPanel();

    BorderLayout b= new BorderLayout();
    windowContent.setLayout(b);

      JPanel button = new JPanel();
     GridLayout g =  new GridLayout(4,3);
        button.setLayout(g);

     // creating buttons
    JTextArea input= new JTextArea();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7"); 
    JButton b8 = new JButton("8"); 
    JButton b9 = new JButton("9"); 
    JButton b0 = new JButton("0"); 
    JButton add = new JButton("+"); 
    JButton sub = new JButton("-");
//     JButton mul = new JButton("*"); 


    windowContent.add(input, BorderLayout.NORTH);

    button.add(b1 );
    button.add(b2 );
    button.add(b3 );
    button.add(b4 );
    button.add(b5 );
    button.add(b6);
    button.add(b7 );
    button.add(b8 );
    button.add(b9 );
    button.add(add );
    button.add(b0 );
     button.add(sub);

//      button.add(mul);

     windowContent.add(button, BorderLayout.CENTER); 

    JFrame frame= new JFrame("MY THIRD CALCULATOR");

     frame.setContentPane(windowContent);

    frame.setSize(300, 300);
    frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
}