package MHPaintClasses;

import java.awt.Dimension;

import javax.swing.JComponent;

public class Space extends JComponent {
	public Space() {
		super();
		this.setPreferredSize(new Dimension(0, 0));
		this.setOpaque(false);
	}
}
