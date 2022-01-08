package MHPaintSetting;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MHPaintClasses.BackgroundPanel;
import MHPaintClasses.DrawPanel;
import MHPaintClasses.Space;

public class SettingForm extends JFrame implements ActionListener {

	public static JButton btnClose;

	public static final int settingWidth = 800;
	public static final int settingHeight = 500;

	private SettingTitlePanel Title;
	private JPanel jpnlBackground;

	//////////////////////////////////
	// @@@@@@@@@@@@@ Left Attributes
	private JPanel jpnlLeft;
	private DrawPanel Draw;
	private BackgroundPanel Back;

	private JButton CanvasColorName;
	private Color clrsCanvas[];
	private JPanel CanvasColor;
	private JButton btnCanvasColors[];

	private JButton BackgroundColorName;
	private Color clrsBackground[];
	private BGroundColor BackgroundColor;
	private JButton btnBackgroundColors[];
	//////////////////////////////////

	//////////////////////////////////
	// @@@@@@@@@@@@@ Center Attributes
	private JPanel jpnlCenter;
	private JButton btnCanvasIco;
	private JButton btnCanvasName;
	private JButton btnBackgroundIco;
	private JButton btnBackgroundName;
	/////////////////////////////////

	//////////////////////////////////
	// @@@@@@@@@@@@@ Right Attributes
	private JPanel jpnlRight;
	//////////////////////////////////

	public SettingForm(DrawPanel draw) {
		super();
		this.setBounds(400, 200, settingWidth, settingHeight);
		this.setResizable(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// this.setAlwaysOnTop(true);
		this.setUndecorated(true);
		this.setType(Type.UTILITY);
		this.Draw = draw;
		// this.Back = back;

		jpnlBackground = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getHeight(), endY = getHeight();
				Color startColor = new Color(0, 153, 204);
				Color endColor = new Color(204, 0, 190);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRect(0, 0, getWidth(), getHeight());
			}

		};
		jpnlBackground.setPreferredSize(new Dimension(settingWidth, settingHeight));
		jpnlBackground.setLocation(new Point(-10, -10));
		jpnlBackground.setLayout(new BorderLayout());

		Title = new SettingTitlePanel(this);

		btnClose = new JButton(new ImageIcon("Images/CloseBW.png"));
		btnClose.setPreferredSize(new Dimension(35, 35));
		btnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnClose.addActionListener(this);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorderPainted(false);
		btnClose.setFocusPainted(false);
		btnClose.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnClose.setIcon(new ImageIcon("Images/CloseBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnClose.setIcon(new ImageIcon("Images/Close.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		Title.add(btnClose);
		///////////////////////////////////////////////////////

		///////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>> Left Components <<<<<<<<<<<<<<<<<
		jpnlLeft = new JPanel();
		jpnlLeft.setPreferredSize(new Dimension(300, 400));
		jpnlLeft.setLayout(new FlowLayout());
		jpnlLeft.setOpaque(false);

		Space spacebt = new Space();
		spacebt.setPreferredSize(new Dimension(300, 70));
		jpnlLeft.add(spacebt);

		JPanel help1 = new JPanel();
		help1.setOpaque(false);
		help1.setPreferredSize(new Dimension(200, 40));
		help1.setLayout(new CardLayout());
		help1.setVisible(false);
		jpnlLeft.add(help1);

		JPanel help2 = new JPanel();
		help2.setOpaque(false);
		help2.setPreferredSize(new Dimension(200, 210));
		help2.setLayout(new CardLayout());
		help2.setVisible(false);
		jpnlLeft.add(help2);

		// ?????????????????????????????????????????????
		// CanvasColor

		CanvasColorName = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(0, 153, 204);
				Color endColor = new Color(204, 0, 190);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 40, 40);

			}
		};
		CanvasColorName.setPreferredSize(new Dimension(120, 30));
		JLabel lblname = new JLabel("Canvas Colors");
		lblname.setForeground(Color.white);
		lblname.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
		CanvasColorName.add(lblname);
		CanvasColorName.setMargin(new Insets(0, 50, 10, 0));
		CanvasColorName.setForeground(Color.white);
		CanvasColorName.setOpaque(false);
		CanvasColorName.setContentAreaFilled(false);
		CanvasColorName.setBorderPainted(false);
		CanvasColorName.setFocusPainted(false);
		CanvasColorName.setVisible(false);
		help1.add(CanvasColorName);

		CanvasColor = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(204, 0, 190);
				Color endColor = new Color(0, 153, 204);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 40, 40);

			}
		};
		CanvasColor.setPreferredSize(new Dimension(200, 200));
		CanvasColor.setOpaque(false);
		CanvasColor.setLayout(new FlowLayout(FlowLayout.CENTER));
		CanvasColor.setVisible(false);
		help2.add(CanvasColor);

		clrsCanvas = new Color[7];
		clrsCanvas[0] = new Color(0, 194, 204);
		clrsCanvas[1] = new Color(0, 204, 150);
		clrsCanvas[2] = new Color(0, 130, 204);
		clrsCanvas[3] = new Color(85, 85, 85);
		clrsCanvas[4] = new Color(255, 255, 255);
		clrsCanvas[5] = new Color(204, 0, 113);
		clrsCanvas[6] = new Color(63, 255, 249);

		JPanel jpnlClose = new JPanel();
		jpnlClose.setOpaque(false);
		jpnlClose.setPreferredSize(new Dimension(200, 50));
		jpnlClose.setLayout(new FlowLayout(FlowLayout.RIGHT));
		CanvasColor.add(jpnlClose);

		JButton close = new JButton(new ImageIcon("Images/CloseBW.png"));
		close.setPreferredSize(new Dimension(40, 40));
		close.setContentAreaFilled(false);
		close.setFocusPainted(false);
		close.setBorderPainted(false);
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				help1.setVisible(false);
				help2.setVisible(false);
			}
		});
		jpnlClose.add(close);

		btnCanvasColors = new JButton[8];
		btnCanvasColors[0] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[0]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[1] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[1]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[2] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[2]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[3] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[3]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[4] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[4]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[5] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[5]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[6] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsCanvas[6]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 60, 60);
			}
		};

		btnCanvasColors[7] = new JButton();
		btnCanvasColors[7].setIcon(new ImageIcon("Images/canvasColorPick.png"));

		for (int x = 0; x < 8; x++) {
			btnCanvasColors[x].setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnCanvasColors[x].setPreferredSize(new Dimension(40, 40));
			btnCanvasColors[x].setContentAreaFilled(false);
			btnCanvasColors[x].setBorderPainted(false);
			btnCanvasColors[x].setFocusPainted(false);
			CanvasColor.add(btnCanvasColors[x]);
		}

		btnCanvasColors[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[0]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);

			}
		});

		btnCanvasColors[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[1]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[2]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[3]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[4]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[5]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsCanvas[6]);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnCanvasColors[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color x = JColorChooser.showDialog(null, "Select  a  color for shapes", Color.black);
				Draw.setBackground(x);
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		// ??????????????????????????????????????????????????

		// ?????????????????????????????????????????????
		// BackgroundColor

		BackgroundColorName = new JButton() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(0, 153, 204);
				Color endColor = new Color(204, 0, 190);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 40, 40);

			}
		};
		BackgroundColorName.setPreferredSize(new Dimension(120, 30));
		JLabel lblname2 = new JLabel("Background Colors");
		lblname2.setForeground(Color.white);
		lblname2.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
		BackgroundColorName.add(lblname2);
		BackgroundColorName.setMargin(new Insets(0, 35, 10, 0));
		BackgroundColorName.setForeground(Color.white);
		BackgroundColorName.setOpaque(false);
		BackgroundColorName.setContentAreaFilled(false);
		BackgroundColorName.setBorderPainted(false);
		BackgroundColorName.setFocusPainted(false);
		BackgroundColorName.setVisible(false);
		help1.add(BackgroundColorName);

		BackgroundColor = new BGroundColor();
		help2.add(BackgroundColor);

		clrsBackground = new Color[7];
		clrsBackground[0] = new Color(0, 194, 204);
		clrsBackground[1] = new Color(206, 216, 231);
		clrsBackground[2] = new Color(0, 130, 204);
		clrsBackground[3] = new Color(85, 85, 85);

		JPanel jpnlClose2 = new JPanel();
		jpnlClose2.setOpaque(false);
		jpnlClose2.setPreferredSize(new Dimension(200, 50));
		jpnlClose2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		BackgroundColor.add(jpnlClose2);

		JButton close2 = new JButton(new ImageIcon("Images/CloseBW.png"));
		close2.setPreferredSize(new Dimension(40, 40));
		close2.setContentAreaFilled(false);
		close2.setFocusPainted(false);
		close2.setBorderPainted(false);
		close2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
				help1.setVisible(false);
				help1.setVisible(false);
			}
		});
		jpnlClose2.add(close2);

		btnBackgroundColors = new JButton[4];
		btnBackgroundColors[0] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsBackground[0]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 90, 90);
			}
		};

		btnBackgroundColors[1] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsBackground[1]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 90, 90);
			}
		};

		btnBackgroundColors[2] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsBackground[2]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 90, 90);
			}
		};

		btnBackgroundColors[3] = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(clrsBackground[3]);
				g.fillRoundRect(1, 1, getWidth() - 1, getHeight() - 1, 90, 90);
			}
		};

		for (int x = 0; x < 4; x++) {
			btnBackgroundColors[x].setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnBackgroundColors[x].setPreferredSize(new Dimension(70, 70));
			btnBackgroundColors[x].setContentAreaFilled(false);
			btnBackgroundColors[x].setBorderPainted(false);
			btnBackgroundColors[x].setFocusPainted(false);
			BackgroundColor.add(btnBackgroundColors[x]);
		}

		btnBackgroundColors[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsBackground[0]);
				BackgroundColorName.setVisible(false);
				BackgroundColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);

			}
		});

		btnBackgroundColors[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsBackground[1]);
				BackgroundColorName.setVisible(false);
				BackgroundColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnBackgroundColors[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsBackground[2]);
				BackgroundColorName.setVisible(false);
				BackgroundColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		btnBackgroundColors[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setBackground(clrsBackground[3]);
				BackgroundColorName.setVisible(false);
				BackgroundColor.setVisible(false);
				help1.setVisible(false);
				help2.setVisible(false);
				BackgroundColor.setVisible(false);
				BackgroundColorName.setVisible(false);
			}
		});

		// ???????????????????????????????????????????????

		///////////////////////////////////////////////////////

		///////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>> Center Components <<<<<<<<<<<<<<<<<
		jpnlCenter = new JPanel();
		jpnlCenter.setPreferredSize(new Dimension(200, 400));
		jpnlCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
		jpnlCenter.setOpaque(false);

		btnCanvasIco = new JButton(new ImageIcon("Images/CanvasIco.png"));
		btnCanvasIco.setPreferredSize(new Dimension(200, 160));
		btnCanvasIco.setMargin(new Insets(120, 0, 0, 0));
		btnCanvasIco.setContentAreaFilled(false);
		btnCanvasIco.setBorderPainted(false);
		btnCanvasIco.setFocusPainted(false);
		jpnlCenter.add(btnCanvasIco);

		btnCanvasName = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(204, 0, 190);
				Color endColor = new Color(0, 153, 204);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);

			}

		};
		JLabel lblCanvasName = new JLabel("Change Canvas Color");
		lblCanvasName.setForeground(new Color(210, 210, 210));
		btnCanvasName.add(lblCanvasName);
		btnCanvasName.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCanvasName.setPreferredSize(new Dimension(180, 40));
		btnCanvasName.setMargin(new Insets(0, 25, 0, 0));
		btnCanvasName.setContentAreaFilled(false);
		btnCanvasName.setBorderPainted(false);
		btnCanvasName.setFocusPainted(false);
		btnCanvasName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CanvasColorName.setVisible(true);
				CanvasColor.setVisible(true);
				help1.setVisible(true);
				help2.setVisible(true);
				BackgroundColorName.setVisible(false);
				BackgroundColor.setVisible(false);
			}
		});
		jpnlCenter.add(btnCanvasName);

		btnBackgroundIco = new JButton(new ImageIcon("Images/BackgroundIco.png"));
		btnBackgroundIco.setMargin(new Insets(35, 0, 0, 0));
		btnBackgroundIco.setPreferredSize(new Dimension(200, 75));
		btnBackgroundIco.setContentAreaFilled(false);
		btnBackgroundIco.setBorderPainted(false);
		btnBackgroundIco.setFocusPainted(false);
		jpnlCenter.add(btnBackgroundIco);

		btnBackgroundName = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(204, 0, 190);
				Color endColor = new Color(0, 153, 204);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);

			}

		};
		JLabel lblBackgroundName = new JLabel("Change Background Color");
		lblBackgroundName.setForeground(new Color(210, 210, 210));
		btnBackgroundName.add(lblBackgroundName);
		btnBackgroundName.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBackgroundName.setPreferredSize(new Dimension(200, 40));
		btnBackgroundName.setMargin(new Insets(0, 25, 0, 0));
		btnBackgroundName.setContentAreaFilled(false);
		btnBackgroundName.setBorderPainted(false);
		btnBackgroundName.setFocusPainted(false);
		btnBackgroundName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CanvasColorName.setVisible(false);
				CanvasColor.setVisible(false);
				help1.setVisible(true);
				help2.setVisible(true);
				BackgroundColorName.setVisible(true);
				BackgroundColor.setVisible(true);
			}
		});
		jpnlCenter.add(btnBackgroundName);
		///////////////////////////////////////////////////////

		///////////////////////////////////////////////////////
		// >>>>>>>>>>>>>>>> Right Components <<<<<<<<<<<<<<<<<
		jpnlRight = new JPanel();
		jpnlRight.setPreferredSize(new Dimension(300, 400));
		jpnlRight.setOpaque(false);
		///////////////////////////////////////////////////////

		jpnlBackground.add(Title, BorderLayout.NORTH);
		jpnlBackground.add(jpnlLeft, BorderLayout.WEST);
		jpnlBackground.add(jpnlCenter, BorderLayout.CENTER);
		jpnlBackground.add(jpnlRight, BorderLayout.EAST);

		this.add(jpnlBackground);
	}

	public void actionPerformed(ActionEvent e) {
		btnClose = (JButton) e.getSource();
		this.dispose();
	}
}
