package MHPaintMenus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import MHPaintClasses.MHMMain;

public class MenuButtons extends JPanel {

	private JButton btnFile;
	private JButton btnHome;

	private MenuPanel jpnlTtitle;

	public MenuButtons(MenuPanel pnlTtitle) {
		super();
		this.setPreferredSize(new Dimension(MHMMain.GWIDTH, 35));
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.jpnlTtitle = pnlTtitle;

		btnFile = new JButton("File");
		btnFile.setPreferredSize(new Dimension(60, 32));
		btnFile.setBorderPainted(false);
		btnFile.setFocusPainted(false);
		btnFile.setBackground(new Color(25, 121, 202));
		btnFile.setForeground(Color.white);
		btnFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jpnlTtitle.HidePanels('H');
			}
		});

		btnHome = new JButton("Home");
		btnHome.setPreferredSize(new Dimension(70, 32));
		btnHome.setBorderPainted(false);
		btnHome.setFocusPainted(false);
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jpnlTtitle.HidePanels('F');
				btnHome.setBackground(new Color(245, 246, 247));
			}
		});

		this.add(btnFile);
		this.add(btnHome);

	}

}
