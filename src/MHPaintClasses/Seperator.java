package MHPaintClasses;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Seperator extends JButton {
	public Seperator() {
		super();
		this.setPreferredSize(new Dimension(0, 0));
		this.setBackground(new Color(36, 213, 240));
		this.setBorderPainted(false);
		this.setFocusPainted(false);
	}
}
