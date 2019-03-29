import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener{
	JButton button=new JButton();
	JTextField textfield=new JTextField(20);
	JLabel label=new JLabel();
public static void main(String[] args) {
	BinaryConverter bc=new BinaryConverter();
	bc.gui();
	
}
void gui() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	frame.add(panel);
	//panel.setVisible(true);
	panel.add(textfield);
	//textfield.setVisible(true);
	//label.setVisible(true);
	panel.add(button);
	panel.add(label);
	//button.setVisible(true);
	button.addMouseListener(this);
	
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		String letter=convert(textfield.getText());
		label.setText(letter);
	}
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
