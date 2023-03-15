package bca6sem;


import javax.swing.*;
import java.awt.*;

public class GridLayoutCalculator {
    public static void main(String[] args){
        //Create a panel
        JPanel windowContent = new JPanel();

        //set a layout manager for this panel
        GridLayout g1 =  new GridLayout(4,2);
        windowContent.setLayout(g1);

        //create controls in memory
        JLabel label1 = new JLabel ("Number 1");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel ("Number 2");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel ("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //add controls to the panel
        windowContent.add(label1);
        windowContent.add(field1);
         windowContent.add(label2);
        windowContent.add(field2);
         windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        //create the frame and add the panel to it
        JFrame frame= new JFrame("MY FIRST CALCULATOR");

        //add the panel to top level container
        frame.setContentPane(windowContent);

        //set the size and make the window visible
        frame.setSize(400,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
