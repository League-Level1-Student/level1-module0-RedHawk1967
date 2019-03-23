import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {

public static void main(String[] args) {
	


SoundEffects sound = new SoundEffects();

sound.gui();











}

JButton button2 = new JButton();
JButton button1 = new JButton();
public void gui() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	

	frame.setVisible(true);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button1.setPreferredSize(new Dimension(250,250));
	button2.setPreferredSize(new Dimension(250,250));
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	
	
	playSound("cannon.wav");
	JButton clicked = (JButton) e.getSource();
	if (clicked == button1) { playSound("cannon.wav");
		
	} else if (clicked == button2) {
	playSound("acco.wav");	
	}

}

	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();

}
	}






