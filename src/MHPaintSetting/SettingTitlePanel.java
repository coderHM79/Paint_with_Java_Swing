package MHPaintSetting;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import MHPaintClasses.MHMMain;

public class SettingTitlePanel extends JPanel {

	//////////////////////////////////
	// @@@@@@@@@@@@@ Title Attributes
	private JButton btnLogo;
	private JLabel formName;
	private JLabel lblLight;
	private boolean selected = false;
	private JToggleButton btnDarkMode;
	private JLabel lblDark;
	/////////////////////////////////

	private Point initialClick;
	private JFrame parent;

	public SettingTitlePanel(final SettingForm parent) {
		super();
		this.setPreferredSize(new Dimension(SettingForm.settingWidth, 80));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setOpaque(false);
		this.parent = parent;

		// PrintWriter write = new PrintWriter(GMain.file1);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				initialClick = e.getPoint();
				getComponentAt(initialClick);
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {

				// get location of Window
				int thisX = parent.getLocation().x;
				int thisY = parent.getLocation().y;

				// Determine how much the mouse moved since the initial click
				int xMoved = e.getX() - initialClick.x;
				int yMoved = e.getY() - initialClick.y;

				// Move window to this position
				int X = thisX + xMoved;
				int Y = thisY + yMoved;
				parent.setLocation(X, Y);
			}
		});

		btnLogo = new JButton(new ImageIcon("AnimatedImages/settingLogo.gif"));
		btnLogo.setPreferredSize(new Dimension(80, 80));
		btnLogo.setContentAreaFilled(false);
		btnLogo.setBorderPainted(false);
		btnLogo.setFocusPainted(false);
		this.add(btnLogo);

		formName = new JLabel("Setting");
		formName.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		formName.setForeground(Color.white);
		formName.setPreferredSize(new Dimension(190, 30));
		this.add(formName);

		lblLight = new JLabel("Light Mode");
		lblLight.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
		lblLight.setForeground(Color.white);
		lblLight.setPreferredSize(new Dimension(75, 20));
		this.add(lblLight);

		btnDarkMode = new JToggleButton(new ImageIcon("Images/ToggleOff.png"));
		if (MHMMain.Mode == 0)
			btnDarkMode.setIcon(new ImageIcon("Images/ToggleOff.png"));
		else
			btnDarkMode.setIcon(new ImageIcon("Images/ToggleOff.png"));
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
				selected = abstractButton.getModel().isSelected();
				if (selected == false) {
					btnDarkMode.setIcon(new ImageIcon("Images/ToggleOff.png"));
					// write.write("STATE: #0");
					// write.close();
				} else {
					btnDarkMode.setIcon(new ImageIcon("Images/ToggleOn.png"));
					// write.write("STATE: #1");
					// write.close();
				}
			}
		};
		btnDarkMode.addActionListener(actionListener);
		btnDarkMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnDarkMode.setPreferredSize(new Dimension(40, 40));
		btnDarkMode.setContentAreaFilled(false);
		btnDarkMode.setBorderPainted(false);
		btnDarkMode.setFocusPainted(false);
		this.add(btnDarkMode);

		lblDark = new JLabel("Night Mode");
		lblDark.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
		lblDark.setForeground(Color.white);
		lblDark.setPreferredSize(new Dimension(335, 20));
		this.add(lblDark);

	}
}
