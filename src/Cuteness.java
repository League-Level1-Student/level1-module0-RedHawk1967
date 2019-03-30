import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cuteness implements ActionListener {
public static void main(String[] args) {
	
Cuteness cute = new Cuteness();
cute.ui();
}
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public void ui() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	
	
	
	
	
	
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonclicked =  (JButton) e.getSource();
	if (buttonclicked == button1 ) {
	showDucks();
	} else if (buttonclicked == button2 ) {
		showFrog();
		} else if (buttonclicked == button3) {
			showFluffyUnicorns();
		} 











}
void showDucks() {
    playVideo1("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo1("https://www.youtube.com/watch?v=ZcoqR9Bwx1Y");
}

void showFluffyUnicorns() {
    playVideo1("https://www.youtube.com/watch?v=kMmpRcld1FU");
}

void playVideo1(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}




private void playVideo(String string) {
	// TODO Auto-generated method stub
	
}




















}
