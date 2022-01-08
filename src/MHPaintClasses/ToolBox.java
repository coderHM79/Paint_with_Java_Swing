package MHPaintClasses;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBox extends JPanel {

	private Color c = Color.white;

	private JButton Btns[];

	private DrawPanel pnlDraw;

	public ToolBox(DrawPanel Draw) {
		super();
		setOpaque(true);
		setBackground(Color.red);
		setPreferredSize(new Dimension(60, MHMMain.GHEIGHT - 410));
		setLayout(new FlowLayout());
		this.pnlDraw = Draw;

		if (MHMMain.Mode == 0)
			c = new Color(240, 240, 240);
		else
			c = new Color(90, 90, 90);

		Btns = new JButton[10];
		for (int i = 0; i < 10; i++) {
			Btns[i] = new JButton();
			Btns[i].setPreferredSize(new Dimension(32, 32));
			Btns[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
			Btns[i].setBorderPainted(false);
			Btns[i].setFocusPainted(false);
			Btns[i].setContentAreaFilled(false);
		}

		Btns[0].setPreferredSize(new Dimension(20, 10));
		this.add(Btns[0]);

		Btns[1].setIcon(new ImageIcon("Images/CircleBW.png"));
		Btns[1].setToolTipText("Circle");
		Btns[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnlDraw.setShapeTools(ShapeTools.Oval);
			}
		});
		Btns[1].addMouseListener(new MouseListener() {

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
				Btns[1].setIcon(new ImageIcon("Images/CircleBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[1].setIcon(new ImageIcon("Images/Circle.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[1]);

		Btns[2].setIcon(new ImageIcon("Images/filledCircleBW.png"));
		Btns[2].setToolTipText("Filled Circle");
		Btns[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnlDraw.setShapeTools(ShapeTools.filledOval);
			}
		});
		Btns[2].addMouseListener(new MouseListener() {

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
				Btns[2].setIcon(new ImageIcon("Images/filledcircleBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[2].setIcon(new ImageIcon("Images/filledcircle.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[2]);

		Btns[3].setIcon(new ImageIcon("Images/LineBW.png"));
		Btns[3].setToolTipText("Line");
		Btns[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnlDraw.setShapeTools(ShapeTools.Line);
			}
		});
		Btns[3].addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Btns[3].setIcon(new ImageIcon("Images/LineBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[3].setIcon(new ImageIcon("Images/Line.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[3]);

		Btns[4].setIcon(new ImageIcon("Images/RectangleBW.png"));
		Btns[4].setToolTipText("Rectanle");
		Btns[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnlDraw.setShapeTools(ShapeTools.Rect);
			}
		});
		Btns[4].addMouseListener(new MouseListener() {

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
				Btns[4].setIcon(new ImageIcon("Images/RectangleBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[4].setIcon(new ImageIcon("Images/Rectange.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[4]);

		Btns[5].setIcon(new ImageIcon("Images/filledRectangleBW.png"));
		Btns[5].setToolTipText("Filled Rectangle");
		Btns[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pnlDraw.setShapeTools(ShapeTools.filledRect);
			}
		});
		Btns[5].addMouseListener(new MouseListener() {

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
				Btns[5].setIcon(new ImageIcon("Images/filledRectangleBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[5].setIcon(new ImageIcon("Images/filledRectangle.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[5]);

		Btns[6].setIcon(new ImageIcon("Images/triangleBW.png"));
		Btns[6].setToolTipText("Diamond");
		Btns[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setShapeTools(ShapeTools.Triangle);
			}
		});
		Btns[6].addMouseListener(new MouseListener() {

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
				Btns[6].setIcon(new ImageIcon("Images/triangleBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[6].setIcon(new ImageIcon("Images/triangle.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[6]);

		Btns[7].setIcon(new ImageIcon("Images/CubeBW.png"));
		Btns[7].setToolTipText("Cube");
		Btns[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setShapeTools(ShapeTools.Cube);

			}
		});
		Btns[7].addMouseListener(new MouseListener() {

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
				Btns[7].setIcon(new ImageIcon("Images/CubeBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[7].setIcon(new ImageIcon("Images/Cube.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[7]);

		Btns[8].setIcon(new ImageIcon("Images/DiamondBW.png"));
		Btns[8].setToolTipText("Filled Cube");
		Btns[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setShapeTools(ShapeTools.Dimond);
			}
		});
		Btns[8].addMouseListener(new MouseListener() {

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
				Btns[8].setIcon(new ImageIcon("Images/DiamondBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[8].setIcon(new ImageIcon("Images/Diamond.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[8]);

		Btns[9].setIcon(new ImageIcon("Images/starBW.png"));
		Btns[9].setPreferredSize(new Dimension(32, 32));
		Btns[9].setToolTipText("More Shapes");
		Btns[9].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Draw.setShapeTools(ShapeTools.Star);
			}
		});
		Btns[9].addMouseListener(new MouseListener() {

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
				Btns[9].setIcon(new ImageIcon("Images/starBW.png"));

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Btns[9].setIcon(new ImageIcon("Images/star.png"));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(Btns[9]);

	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(c);
		g.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 60, 60);
	}
}