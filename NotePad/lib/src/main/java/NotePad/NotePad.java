package NotePad;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class NotePad extends JFrame implements ActionListener {
	
	NotePad(){
		setExtendedState(JFrame.MAXIMIZED_BOTH); // responsive page for different screens 
		
		setTitle("Notepad");
		ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
		Image icon = imageIcon.getImage();
		setIconImage(icon);
		
		JMenuBar menubar = new JMenuBar();  // creating menu bar
		menubar.setBackground(Color.white);
		JMenu file = new JMenu("FIle");  // creating Menu
		file.setFont(new Font("Arial",Font.PLAIN,14));
		
		JMenuItem newItem = new JMenuItem("New");
		newItem.addActionListener(this);
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));  // Press Ctrl+N to create new Txt file
		
		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(this);
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));  // Press Ctrl+O to  Open Existing Txt file
		
		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(this);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));  // Press Ctrl+S to Save Txt file
		
		JMenuItem print = new JMenuItem("Print");
		print.addActionListener(this);
		print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));  // Press Ctrl+P to Print Txt file
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,ActionEvent.CTRL_MASK));  // Press esc to exit the notepad
		
		file.add(newItem);
		file.add(open);
		file.add(save);
		file.add(print);
		file.add(exit);
		menubar.add(file);  // adding menu to menu-bar
		
		JMenu edit = new JMenu("Edit");  // creating Menu
		edit.setFont(new Font("Arial",Font.PLAIN,14));
		
		JMenuItem cut = new JMenuItem("Cut");
		cut.addActionListener(this);
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));  // Press Ctrl+X to cut the text
		
		JMenuItem copy = new JMenuItem("Copy");
		copy.addActionListener(this);
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));  // Press Ctrl+C to  Copy the text
		
		JMenuItem paste = new JMenuItem("Paste");
		paste.addActionListener(this);
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));  // Press Ctrl+V to paste the text
		
		JMenuItem selectAll = new JMenuItem("Select All");
		selectAll.addActionListener(this);
		selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));  // Press Ctrl+A to Select the all the text
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		menubar.add(edit);  // adding menu to menu-bar
		
		JMenu helpMenu = new JMenu("Help");  // creating Menu
		helpMenu.setFont(new Font("Arial",Font.PLAIN,14));
		
		JMenuItem help = new JMenuItem("Help");
		help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));  // Press Ctrl+X to cut the text
		help.addActionListener(this);
		helpMenu.add(help);
		menubar.add(helpMenu);
		 JTextArea area = new JTextArea();
		 area.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		 area.setLineWrap(true); // Go to next line when achieve max length of the screen
		 area.setWrapStyleWord(true); // Move to next Line when Word length is grater than space remaining 
//		 add(area);
		 
		 JScrollPane pane = new JScrollPane(area);
		 pane.setBorder(BorderFactory.createEmptyBorder());
		 add(pane);
		 
		setJMenuBar(menubar);   //adding Menu-bar to the JFrame
		setVisible(true); // make shore to make it last statement
	}

	public static void main(String[] args) {
		NotePad notepad = new NotePad();
//		new NotePad();  // it is called enormous Object

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
