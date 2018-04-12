package views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		
		setTitle(UIConstant.TITLE_APP);
		setIconImage(createImageIcon(UIConstant.ICON_APP).getImage());
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}
