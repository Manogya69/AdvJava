package bca6sem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
public class CalculatorEngineMsg implements ActionListener {

public void actionPerformed(ActionEvent e) {
	JButton clickedButton = (JButton) e.getSource();
	String ClickedButtonLabel = clickedButton.getText();
	JOptionPane.showConfirmDialog(null,"You Pressed " + ClickedButtonLabel, "just a test", JOptionPane.PLAIN_MESSAGE);
}
}
