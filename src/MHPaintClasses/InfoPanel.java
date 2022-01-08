package MHPaintClasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InfoPanel extends JPanel {

	private Color c = Color.white;

	private JButton jbtnSeprator;

	private JPanel jpnlRest;
	private BufferedImage imgRest;
	private JButton jbtnReset;
	private JButton jlblReset;
	// =====================================
	// X,X1,X2 Attributes
	private JPanel jpnlX;
	private BufferedImage buttonIconX;
	private JButton jbtnX;
	private JLabel jlblX, jlblX1Name, jlblX1Amount, jlblX2Name, jlblX2Amount;
	// =====================================

	// =====================================
	// Y,Y1,Y2 Attributes
	private JPanel jpnlY;
	private BufferedImage buttonIconY;
	private JButton jbtnY;
	private JLabel jlblY, jlblY1Name, jlblY1Amount, jlblY2Name, jlblY2Amount;
	// =====================================

	public InfoPanel() throws IOException {
		super();
		this.setPreferredSize(new Dimension(300, 300));
		this.setOpaque(true);

		if (MHMMain.Mode == 0)
			c = new Color(240, 240, 240);
		else
			c = new Color(90, 90, 90);

		/////////////////////////////////////////////////
		// @@@@@@@@@@@@@@@@ X Components @@@@@@@@@@@@@@@@@@@@
		jpnlX = new JPanel();
		jpnlX.setPreferredSize(new Dimension(125, 140));
		jpnlX.setOpaque(false);
		jpnlX.setLayout(new FlowLayout(FlowLayout.LEFT));

		buttonIconX = ImageIO.read(new File("Images/X.png"));
		jbtnX = new JButton(new ImageIcon(buttonIconX));
		jbtnX.setPreferredSize(new Dimension(50, 50));
		jbtnX.setBorderPainted(false);
		jbtnX.setFocusPainted(false);
		jbtnX.setContentAreaFilled(false);

		jlblX = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblX.setForeground(Color.white);
		else
			jlblX.setForeground(Color.black);
		jlblX.setHorizontalAlignment(SwingConstants.LEFT);
		jlblX.setPreferredSize(new Dimension(40, 40));
		jlblX.setFont(new Font("tahoma", 60, 20));

		jlblX1Name = new JLabel("X1: ");
		if (MHMMain.Mode == 1)
			jlblX1Name.setForeground(new Color(22, 222, 202));
		else
			jlblX1Name.setForeground(new Color(184, 51, 89));
		jlblX1Name.setHorizontalAlignment(SwingConstants.LEFT);
		jlblX1Name.setPreferredSize(new Dimension(40, 40));
		jlblX1Name.setFont(new Font("tahoma", 60, 15));

		jlblX1Amount = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblX1Amount.setForeground(Color.white);
		else
			jlblX1Amount.setForeground(Color.black);
		jlblX1Amount.setHorizontalAlignment(SwingConstants.LEFT);
		jlblX1Amount.setPreferredSize(new Dimension(60, 40));
		jlblX1Amount.setFont(new Font("tahoma", 60, 15));

		jlblX2Name = new JLabel("X2: ");
		if (MHMMain.Mode == 1)
			jlblX2Name.setForeground(new Color(22, 222, 202));
		else
			jlblX2Name.setForeground(new Color(184, 51, 89));
		jlblX2Name.setHorizontalAlignment(SwingConstants.LEFT);
		jlblX2Name.setPreferredSize(new Dimension(40, 40));
		jlblX2Name.setFont(new Font("tahoma", 60, 12));

		jlblX2Amount = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblX2Amount.setForeground(Color.white);
		else
			jlblX2Amount.setForeground(Color.black);
		jlblX2Amount.setHorizontalAlignment(SwingConstants.LEFT);
		jlblX2Amount.setPreferredSize(new Dimension(60, 40));
		jlblX2Amount.setFont(new Font("tahoma", 60, 12));

		jpnlX.add(jbtnX);
		jpnlX.add(jlblX);
		jpnlX.add(jlblX1Name);
		jpnlX.add(jlblX1Amount);
		jpnlX.add(jlblX2Name);
		jpnlX.add(jlblX2Amount);
		////////////////////////////////////////////////

		jbtnSeprator = new JButton();
		jbtnSeprator.setPreferredSize(new Dimension(2, 150));
		if (MHMMain.Mode == 1)
			jbtnSeprator.setBackground(new Color(22, 222, 202));
		else
			jbtnSeprator.setBackground(new Color(224, 0, 107));
		jbtnSeprator.setBorderPainted(false);
		jbtnSeprator.setFocusPainted(false);

		/////////////////////////////////////////////////
		// @@@@@@@@@@@@@@@@ Y Components @@@@@@@@@@@@@@@@@@@@
		jpnlY = new JPanel();
		jpnlY.setPreferredSize(new Dimension(125, 140));
		jpnlY.setOpaque(false);
		jpnlY.setLayout(new FlowLayout(FlowLayout.LEFT));

		buttonIconY = ImageIO.read(new File("Images/Y.png"));
		jbtnY = new JButton(new ImageIcon(buttonIconY));
		jbtnY.setPreferredSize(new Dimension(50, 50));
		jbtnY.setBorderPainted(false);
		jbtnY.setFocusPainted(false);
		jbtnY.setContentAreaFilled(false);

		jlblY = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblY.setForeground(Color.white);
		else
			jlblY.setForeground(Color.black);
		jlblY.setHorizontalAlignment(SwingConstants.LEFT);
		jlblY.setPreferredSize(new Dimension(60, 40));
		jlblY.setFont(new Font("tahoma", 60, 20));

		jlblY1Name = new JLabel("Y1: ");
		if (MHMMain.Mode == 1)
			jlblY1Name.setForeground(new Color(22, 222, 202));
		else
			jlblY1Name.setForeground(new Color(184, 51, 89));
		jlblY1Name.setHorizontalAlignment(SwingConstants.LEFT);
		jlblY1Name.setPreferredSize(new Dimension(40, 40));
		jlblY1Name.setFont(new Font("tahoma", 60, 15));

		jlblY1Amount = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblY1Amount.setForeground(Color.white);
		else
			jlblY1Amount.setForeground(Color.black);
		jlblY1Amount.setHorizontalAlignment(SwingConstants.LEFT);
		jlblY1Amount.setPreferredSize(new Dimension(60, 40));
		jlblY1Amount.setFont(new Font("tahoma", 60, 15));

		jlblY2Name = new JLabel("Y2: ");
		if (MHMMain.Mode == 1)
			jlblY2Name.setForeground(new Color(22, 222, 202));
		else
			jlblY2Name.setForeground(new Color(184, 51, 89));
		jlblY2Name.setHorizontalAlignment(SwingConstants.LEFT);
		jlblY2Name.setPreferredSize(new Dimension(40, 40));
		jlblY2Name.setFont(new Font("tahoma", 60, 12));

		jlblY2Amount = new JLabel("0");
		if (MHMMain.Mode == 1)
			jlblY2Amount.setForeground(Color.white);
		else
			jlblY2Amount.setForeground(Color.black);
		jlblY2Amount.setHorizontalAlignment(SwingConstants.LEFT);
		jlblY2Amount.setPreferredSize(new Dimension(60, 40));
		jlblY2Amount.setFont(new Font("tahoma", 60, 12));

		jpnlY.add(jbtnY);
		jpnlY.add(jlblY);
		jpnlY.add(jlblY1Name);
		jpnlY.add(jlblY1Amount);
		jpnlY.add(jlblY2Name);
		jpnlY.add(jlblY2Amount);
		////////////////////////////////////////////////

		jpnlRest = new JPanel();
		jpnlRest.setPreferredSize(new Dimension(280, 120));
		jpnlRest.setOpaque(false);
		jpnlRest.setLayout(new FlowLayout(FlowLayout.LEFT));

		imgRest = ImageIO.read(new File("Images/Reset.png"));
		jbtnReset = new JButton(new ImageIcon(imgRest));
		jbtnReset.setPreferredSize(new Dimension(55, 120));
		jbtnReset.setMargin(new Insets(55, 0, 0, 0));
		jbtnReset.setBorderPainted(false);
		jbtnReset.setFocusPainted(false);
		jbtnReset.setContentAreaFilled(false);
		jbtnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlblX.setText("0");
				jlblX1Amount.setText("0");
				jlblX2Amount.setText("0");
				jlblY.setText("0");
				jlblY1Amount.setText("0");
				jlblY2Amount.setText("0");
			}
		});
		jpnlRest.add(jbtnReset);

		jlblReset = new JButton("ReStart");
		jlblReset.setPreferredSize(new Dimension(120, 120));
		jbtnReset.setFont(new Font("tahoma", 60, 40));
		jlblReset.setForeground(new Color(194, 25, 125));
		jlblReset.setBorderPainted(false);
		jlblReset.setFocusPainted(false);
		jlblReset.setContentAreaFilled(false);
		jlblReset.setMargin(new Insets(50, 0, 0, 70));
		jpnlRest.add(jlblReset);

		this.add(jpnlX);
		this.add(jbtnSeprator);
		this.add(jpnlY);
		this.add(jpnlRest);

	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(c);
		g.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 60, 60);
	}

	public void setinfo(String X, String Y, int i) {

		if (i == 0) {
			this.jlblX.setText(X);
			this.jlblY.setText(Y);
		} else if (i == 1) {
			this.jlblX1Amount.setText(X);
			this.jlblY1Amount.setText(Y);
		} else if (i == 2) {
			this.jlblX2Amount.setText(X);
			this.jlblY2Amount.setText(Y);
		}

	}
}
