/**
*Graphical interface
*Just getting started on the GUI. 
*
*@vsoyseth
*/

import java.awt.*;
import javax.swing.*;

class GUI{
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JFrame mainFrame;

	public GUI(){
		mainFrame = new JFrame("It's clobberingtime!");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Getting dimensions
		int screenHeight = (int)screenSize.getHeight();
		int screenWidth  = (int)screenSize.getWidth();

		mainFrame.setSize(screenWidth, screenHeight);
		mainFrame.setVisible(true);
	} 
}