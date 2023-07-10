package NotePad;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame{
	About(){
		
		setBounds(400,100,600,500);
		setLayout(null);
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
		Image l2 = icon.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		JLabel label = new JLabel(l3);
		label.setBounds(70, 40, 400, 60);
		add(label);
		
		
		Image img = icon1.getImage();
		setIconImage(img);
		setTitle("Notepad");
		
		
		setVisible(true); // Make shore it is the last line 
	}

	private void setIcon(Image img) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About();
	}

}
