import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookies implements ActionListener {
	public static void main(String[] args) {

		FortuneCookies fc = new FortuneCookies();
		fc.showButton();

	}

	int rand = new Random().nextInt(5);

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JButton button = new JButton("The ultimate fortune cookie");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		frame.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);

		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Some Fortune Cookies Contain No Fortune");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "About Time I got Out Of That Cookie");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You're Sensitive, Kind, Thoughtful, Wise, and Gullible ");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Your Pet Is Trying To Eat You");
		} else if (rand == 4) {JOptionPane.showMessageDialog(null,"The Fortune You Seek Is In Another Cookie");}
	}
	}

