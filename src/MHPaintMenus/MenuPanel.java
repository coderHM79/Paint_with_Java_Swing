package MHPaintMenus;

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
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MHPaintClasses.BackgroundPanel;
import MHPaintClasses.MHMMain;
import MHPaintClasses.Seperator;
import MHPaintClasses.Space;

public class MenuPanel extends JPanel {

	///////////////////////////////
	// ????????? File Attributes
	private JPanel pnlFile;
	private Color cFile = Color.white;
	private JPanel pnlButtons;
	private JPanel pnlLabels;
	private JButton jbtnNew;
	private JLabel jlblNew;
	private JButton jbtnOpen;
	private JLabel jlblOpen;
	private JButton jbtnSave;
	private JLabel jlblSave;
	private JButton jbtnAbuot;
	private JLabel jlblAbout;
	private JButton jbtnHelp;
	private JLabel jlblHelp;
	///////////////////////////////

	///////////////////////////////
	// ????????? Home Attributes
	private JPanel pnlHome;

	private JPanel pnlUndoRedo;
	private JButton btnUndo;
	private JButton btnRedo;

	private JPanel jpnlName;
	private JButton jbtnName;
	private JPanel jpnlPen;
	private JButton BtnPen;
	private JButton lblPenName;
	private JButton btnPenColor;
	private JButton btnPenColorset;
	private JLabel lblPenColorName;

	private Color cHome = Color.black;

	private JLabel lblSize;
	private JTextField txtSize;
	private JLabel lblPX;
	///////////////////////////////

	private BackgroundPanel back;

	public MenuPanel(BackgroundPanel Back) {
		super();
		this.setOpaque(true);
		this.setPreferredSize(new Dimension(MHMMain.GWIDTH, 115));
		if (MHMMain.Mode == 1)
			this.setBackground(new Color(110, 111, 112));
		else
			this.setBackground(new Color(245, 246, 247));
		this.setLayout(new CardLayout());
		this.back = Back;

		///////////////////////////////////////////////
		// &&&&&&&&&&&&&& File Component &&&&&&&&&&&&&
		pnlFile = new JPanel();
		pnlFile.setLayout(new FlowLayout());
		pnlFile.setPreferredSize(new Dimension(MHMMain.GWIDTH, 110));
		pnlFile.setOpaque(false);
		pnlFile.setVisible(false);
		pnlFile.setLayout(new FlowLayout(FlowLayout.LEFT));

		if (MHMMain.Mode == 1)
			cFile = Color.white;
		else
			cFile = Color.black;

		pnlButtons = new JPanel();
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.setPreferredSize(new Dimension(MHMMain.GWIDTH, 60));
		pnlButtons.setOpaque(false);
		pnlButtons.setLayout(new FlowLayout(FlowLayout.LEFT));

		Space space1 = new Space();
		space1.setPreferredSize(new Dimension(850, 60));

		jbtnNew = new JButton(new ImageIcon("Images/New.png"));
		jbtnNew.setPreferredSize(new Dimension(60, 60));
		jbtnNew.setBorderPainted(false);
		jbtnNew.setFocusPainted(false);
		jbtnNew.setContentAreaFilled(false);

		jbtnOpen = new JButton(new ImageIcon("Images/Open.png"));
		jbtnOpen.setPreferredSize(new Dimension(60, 60));
		jbtnOpen.setBorderPainted(false);
		jbtnOpen.setFocusPainted(false);
		jbtnOpen.setContentAreaFilled(false);

		jbtnSave = new JButton(new ImageIcon("Images/Save.png"));
		jbtnSave.setPreferredSize(new Dimension(60, 60));
		jbtnSave.setBorderPainted(false);
		jbtnSave.setFocusPainted(false);
		jbtnSave.setContentAreaFilled(false);

		jbtnAbuot = new JButton(new ImageIcon("Images/About.png"));
		jbtnAbuot.setPreferredSize(new Dimension(60, 60));
		jbtnAbuot.setBorderPainted(false);
		jbtnAbuot.setFocusPainted(false);
		jbtnAbuot.setContentAreaFilled(false);

		jbtnHelp = new JButton(new ImageIcon("Images/Help.png"));
		jbtnHelp.setPreferredSize(new Dimension(60, 60));
		jbtnHelp.setBorderPainted(false);
		jbtnHelp.setFocusPainted(false);
		jbtnHelp.setContentAreaFilled(false);

		pnlButtons.add(jbtnNew);
		pnlButtons.add(jbtnOpen);
		pnlButtons.add(jbtnSave);
		pnlButtons.add(space1);
		pnlButtons.add(jbtnAbuot);
		pnlButtons.add(jbtnHelp);

		pnlLabels = new JPanel();
		pnlLabels.setLayout(new FlowLayout());
		pnlLabels.setPreferredSize(new Dimension(MHMMain.GWIDTH, 40));
		pnlLabels.setOpaque(false);
		pnlLabels.setLayout(new FlowLayout(FlowLayout.LEFT));

		Space space2 = new Space();
		space2.setPreferredSize(new Dimension(10, 15));

		jlblNew = new JLabel("New");
		jlblNew.setForeground(cFile);
		jlblNew.setPreferredSize(new Dimension(60, 20));
		jlblNew.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		jlblOpen = new JLabel("Open");
		jlblOpen.setForeground(cFile);
		jlblOpen.setPreferredSize(new Dimension(60, 20));
		jlblOpen.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		jlblSave = new JLabel("Save");
		jlblSave.setForeground(cFile);
		jlblSave.setPreferredSize(new Dimension(913, 20));
		jlblSave.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		jlblAbout = new JLabel("About");
		jlblAbout.setForeground(cFile);
		jlblAbout.setPreferredSize(new Dimension(60, 20));
		jlblAbout.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		jlblHelp = new JLabel("Help");
		jlblHelp.setForeground(cFile);
		jlblHelp.setPreferredSize(new Dimension(60, 20));
		jlblHelp.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		pnlLabels.add(space2);
		pnlLabels.add(jlblNew);
		pnlLabels.add(jlblOpen);
		pnlLabels.add(jlblSave);
		pnlLabels.add(jlblAbout);
		pnlLabels.add(jlblHelp);

		pnlFile.add(pnlButtons);
		pnlFile.add(pnlLabels);
		///////////////////////////////////////////////

		///////////////////////////////////////////////
		// &&&&&&&&&&&&&& Home Component &&&&&&&&&&&&&
		pnlHome = new JPanel();
		pnlHome.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlHome.setPreferredSize(new Dimension(MHMMain.GWIDTH, 110));
		pnlHome.setVisible(true);
		pnlHome.setOpaque(false);

		pnlUndoRedo = new JPanel();
		pnlUndoRedo.setLayout(new FlowLayout());
		pnlUndoRedo.setPreferredSize(new Dimension(45, 110));
		pnlUndoRedo.setOpaque(false);
		pnlUndoRedo.setLayout(new FlowLayout(FlowLayout.LEFT));

		btnUndo = new JButton(new ImageIcon("Images/undo.png"));
		btnUndo.setPreferredSize(new Dimension(45, 40));
		btnUndo.setBorderPainted(false);
		btnUndo.setFocusPainted(false);
		btnUndo.setContentAreaFilled(false);
		btnUndo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				back.DrawUndo();
			}
		});

		btnRedo = new JButton(new ImageIcon("Images/redo.png"));
		btnRedo.setPreferredSize(new Dimension(45, 40));
		btnRedo.setBorderPainted(false);
		btnRedo.setFocusPainted(false);
		btnRedo.setContentAreaFilled(false);
		btnRedo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				back.DrawRedo();
			}
		});

		Seperator seperator1 = new Seperator();
		seperator1.setPreferredSize(new Dimension(3, 105));

		pnlUndoRedo.add(btnUndo);
		pnlUndoRedo.add(btnRedo);

		jpnlPen = new JPanel();
		jpnlPen.setLayout(new FlowLayout());
		jpnlPen.setPreferredSize(new Dimension(210, 110));
		jpnlPen.setOpaque(false);
		jpnlPen.setLayout(new FlowLayout(FlowLayout.LEFT));

		jpnlName = new JPanel();
		jpnlName.setPreferredSize(new Dimension(200, 30));
		jpnlName.setOpaque(false);

		jbtnName = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				Graphics2D g2 = (Graphics2D) g;

				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				int startX = 0, startY = 0, endX = getWidth(), endY = getHeight();
				Color startColor = new Color(235, 52, 113);
				Color endColor = new Color(192, 52, 235);

				GradientPaint grad = new GradientPaint(startX, startY, startColor, endX, endY, endColor, false);

				g2.setPaint(grad);
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
			}
		};
		JLabel jlblNameP = new JLabel("PEN");
		jlblNameP.setFont(new Font(Font.SERIF, Font.PLAIN, 13));
		jlblNameP.setForeground(Color.white);
		jbtnName.add(jlblNameP);
		jbtnName.setMargin(new Insets(0, 25, 0, 0));
		jbtnName.setPreferredSize(new Dimension(80, 20));
		jbtnName.setBorderPainted(false);
		jbtnName.setContentAreaFilled(false);
		jbtnName.setFocusPainted(false);
		jpnlName.add(jbtnName);

		JPanel helpBtnPen = new JPanel();
		helpBtnPen.setPreferredSize(new Dimension(60, 80));
		helpBtnPen.setOpaque(false);

		BtnPen = new JButton(new ImageIcon("Images/penIco.png"));
		BtnPen.setPreferredSize(new Dimension(45, 40));
		BtnPen.setBorderPainted(false);
		BtnPen.setFocusPainted(false);
		BtnPen.setContentAreaFilled(false);
		BtnPen.setCursor(new Cursor(Cursor.HAND_CURSOR));
		BtnPen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				back.Pencil();
				back.PencilColorSize(cHome, Integer.parseInt(txtSize.getText()));
			}
		});

		lblPenName = new JButton("Pen");
		lblPenName.setPreferredSize(new Dimension(55, 15));
		lblPenName.setFont(new Font(Font.SERIF, Font.PLAIN, 13));
		lblPenName.setBorderPainted(false);
		lblPenName.setFocusPainted(false);
		lblPenName.setContentAreaFilled(false);

		Seperator sep1 = new Seperator();
		sep1.setPreferredSize(new Dimension(2, 55));
		sep1.setBackground(new Color(235, 52, 113));

		/////////////////////////////////////////////////////////////
		JPanel jpnlSecHelp = new JPanel();
		jpnlSecHelp.setPreferredSize(new Dimension(130, 80));
		jpnlSecHelp.setLayout(new FlowLayout(FlowLayout.LEFT));
		jpnlSecHelp.setOpaque(false);

		btnPenColorset = new JButton() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(cHome);
				g.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 20, 20);

			}
		};
		btnPenColorset.setPreferredSize(new Dimension(20, 20));
		btnPenColorset.setContentAreaFilled(false);
		btnPenColorset.setBorderPainted(false);
		btnPenColorset.setFocusPainted(false);

		btnPenColor = new JButton(new ImageIcon("Images/penColor.png"));
		btnPenColor.setPreferredSize(new Dimension(30, 30));
		btnPenColor.setContentAreaFilled(false);
		btnPenColor.setBorderPainted(false);
		btnPenColor.setFocusPainted(false);
		btnPenColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cHome = JColorChooser.showDialog(null, "Select  a  color for youre pen", Color.black);
				btnPenColorset.repaint();
				back.Pencil();
				back.PencilColorSize(cHome, Integer.parseInt(txtSize.getText()));
			}
		});
		lblPenColorName = new JLabel("Pen Color");
		lblPenColorName.setPreferredSize(new Dimension(60, 20));
		lblPenColorName.setFont(new Font(Font.SERIF, Font.PLAIN, 13));

		lblSize = new JLabel("Size:");
		lblSize.setPreferredSize(new Dimension(30, 20));
		lblSize.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		txtSize = new JTextField() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);

				g.setColor(new Color(21, 191, 214));
				g.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 10, 10);
			}
		};
		txtSize.setPreferredSize(new Dimension(50, 20));
		txtSize.setHorizontalAlignment(JTextField.CENTER);
		txtSize.setText("2");
		txtSize.setBorder(null);

		lblPX = new JLabel("px");
		lblPX.setPreferredSize(new Dimension(30, 20));
		lblPX.setFont(new Font(Font.SERIF, Font.PLAIN, 15));

		jpnlSecHelp.add(btnPenColor);
		jpnlSecHelp.add(btnPenColorset);
		jpnlSecHelp.add(lblPenColorName);
		jpnlSecHelp.add(lblSize);
		jpnlSecHelp.add(txtSize);
		jpnlSecHelp.add(lblPX);
		/////////////////////////////////////////////////////////////

		Seperator seperator = new Seperator();
		seperator.setPreferredSize(new Dimension(2, 105));

		helpBtnPen.add(BtnPen);
		helpBtnPen.add(lblPenName);

		jpnlPen.add(jpnlName);
		jpnlPen.add(helpBtnPen);
		jpnlPen.add(sep1);
		jpnlPen.add(jpnlSecHelp);

		pnlHome.add(pnlUndoRedo);
		pnlHome.add(seperator1);
		pnlHome.add(jpnlPen);
		pnlHome.add(seperator);
		// end of Home
		///////////////////////////////////////////////

		this.add(pnlHome);
		this.add(pnlFile);

	}// end of Constructor

	public void HidePanels(char c1) {
		if (c1 == 'H') {
			pnlFile.setVisible(true);
			pnlHome.setVisible(false);
		} else if (c1 == 'F') {
			pnlHome.setVisible(true);
			pnlFile.setVisible(false);
		}
	}

}// end of Class
