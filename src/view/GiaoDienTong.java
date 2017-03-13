package view;

import java.io.IOException;

import javax.swing.JFrame;

public class GiaoDienTong extends JFrame{
	public GiaoDienTong() throws IOException {
		
		VaoGame vaoGame=new VaoGame();
		add(vaoGame);
		
		setVisible(true);
		setSize(700, 460);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 50);
		setFocusable(true);
		
		// TO DO ADD MENUBAR
		
	}
}
