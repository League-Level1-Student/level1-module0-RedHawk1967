import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	
	public static void main(String[] args) {
System.out.println("hello?"); 
	JackInTheBox jack = new JackInTheBox();
	jack.ui();
	}
public void ui() {
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	frame.pack();
	button.setPreferredSize(new Dimension(300,300));
	panel.add(button);
	frame.add(panel);
	frame.setVisible(true);
	button.addActionListener(this);
	frame.pack();

	











}
int count = 0;
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
count++; 
	if (count == 5) {showPicture("jack.png");
	
}	


}






}
