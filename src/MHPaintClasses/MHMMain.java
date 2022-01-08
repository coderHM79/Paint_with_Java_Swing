package MHPaintClasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import MHPaintMenus.MenuButtons;
import MHPaintMenus.MenuPanel;

public class MHMMain extends JFrame implements MouseMotionListener {

	// public static File file1;

	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public static final int GWIDTH = screenSize.width - 320;// 1200
	public static final int GHEIGHT = screenSize.height - 80;// 720

	public static int XLocation;
	public static int YLocation;

	public static int Mode = 0;

	private MenuPanel pnlTitle;
	private BackgroundPanel pnlBack;
	private MenuButtons pnlMenue;

	public MHMMain() throws IOException, FileNotFoundException {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, GWIDTH, GHEIGHT);
		this.XLocation = screenSize.width / 2 - this.getSize().width / 2;
		this.YLocation = screenSize.height / 2 - this.getSize().height / 2 - 20;
		this.setLocation(XLocation, YLocation);
		this.setTitle("Paint");
		this.setBackground(new Color(245, 246, 247));
		this.setResizable(false);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		layout.setVgap(0);
		this.setLayout(layout);
		ImageIcon img = new ImageIcon("Images/toolsIco.png");
		this.setIconImage(img.getImage());

		/*
		 * file1 = new File("SaveFiles\\SettingSave.txt"); Scanner in = new
		 * Scanner(file1); String s = in.nextLine(); Mode =
		 * Integer.parseInt(s.substring(8));
		 */

		pnlBack = new BackgroundPanel();
		pnlTitle = new MenuPanel(pnlBack);
		pnlMenue = new MenuButtons(pnlTitle);

		this.add(pnlMenue);
		this.add(pnlTitle);
		this.add(pnlBack);

		this.setVisible(true);
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
		new MHMMain();
	}

	public void changeMode(String s) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

}
