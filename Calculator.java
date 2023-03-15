package bca6sem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator {
	
	//declare all calculators components
	
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonAdd;
	JButton buttonSubtract;
	JButton buttonMul;
	JButton buttondiv;
	JPanel p1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a panel for displaying text
		JPanel paneltop = new JPanel();
		
		//create a panel for buttons
		JPanel windowContent = new JPanel();
		
		//Set a layout manager for this panel 
		FlowLayout p1 = new FlowLayout();
		windowContent.setLayout(p1);
		paneltop.setLayout(p1);
		GridLayout g1 = new GridLayout(4,3);
		windowContent.setLayout(g1);
		
		
		//create controls in memory
		JTextField displayField = new JTextField(30);
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPoint = new JButton(".");
		JButton buttonEqual = new JButton("=");
		JButton buttonAdd = new JButton("+");
		JButton buttonSubtract = new JButton("-");
		JButton buttonMul = new JButton("*");
		JButton buttondiv = new JButton("/");
		
		
		//add controls to the panel
		paneltop.add(displayField);
		windowContent.add(button0);
		windowContent.add(button1);
		windowContent.add(button2);
		windowContent.add(button3);
		windowContent.add(button4);
		windowContent.add(button5);
		windowContent.add(button6);
		windowContent.add(button7);
		windowContent.add(button8);
		windowContent.add(button9);
		windowContent.add(buttonPoint);
		windowContent.add(buttonEqual);
		windowContent.add(buttonAdd);
		windowContent.add(buttonSubtract);
		windowContent.add(buttonMul);
		windowContent.add(buttondiv);
		
		CalculatorEngine calcEngine = new CalculatorEngine();
		//CalculatorEngineMsg calcEngine = new CalculatorEngineMsg();
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		buttonAdd.addActionListener(calcEngine);
		buttonSubtract.addActionListener(calcEngine);
		buttonMul.addActionListener(calcEngine);
		buttondiv.addActionListener(calcEngine);
		
		//create the frame and add the panel
		JFrame frame = new JFrame("MY First Calcuator in Java");
		
		//Add the panel to the top-level container
//		frame.setContentPane(windowContent);
		
		//set the size and make window visible
		
		frame.add(paneltop,BorderLayout.NORTH);
		frame.add(windowContent);
		frame.setSize(400,400);
		frame.setVisible(true);
	
	}

	public void  setDisplayValue(String val) {
		displayField.setText(val);
	}

}