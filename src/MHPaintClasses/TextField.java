package MHPaintClasses;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends JPanel implements MouseListener {

	private JButton close;
	private JTextField txt;

	public TextField() {
		super();
		this.setPreferredSize(new Dimension(120, 60));
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.setBorder(null);
		this.setLocation(50, 20);

		close = new JButton(new ImageIcon("Images/delete.png"));
		close.setPreferredSize(new Dimension(20, 20));
		close.setContentAreaFilled(false);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		close.setVisible(false);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(close);

		txt = new JTextField() {

		};
		txt.setPreferredSize(new Dimension(120, 20));
		txt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(173, 173, 173)));
		txt.setOpaque(false);
		txt.setForeground(new Color(100, 100, 100));
		txt.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		txt.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(173, 173, 173)));
				close.setVisible(false);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 56, 132)));
				close.setVisible(true);

			}
		});
		this.add(txt);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		close.setVisible(true);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		close.setVisible(false);

	}

}
