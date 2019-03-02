import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookies implements ActionListener {
public static void main(String[] args) {
	
	
	FortuneCookies fc = new FortuneCookies();
	fc.showButton();


	
	
	
	
	
	
}	
	public void showButton() {
	     System.out.println("Button clicked");
	JFrame frame = new JFrame();
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
	frame.setVisible(true);

















}
	@Override
	public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"WooHoo");
		
	
	
	
	
	
	
	
	}}
