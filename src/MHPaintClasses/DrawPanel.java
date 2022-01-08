package MHPaintClasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

import MHShapes.MHCube;
import MHShapes.MHDimond;
import MHShapes.MHOval;
import MHShapes.MHPen;
import MHShapes.MHRect;
import MHShapes.MHShape;
import MHShapes.MHStar;
import MHShapes.MHTriangle;
import MHShapes.MHlines;

public class DrawPanel extends JComponent implements MouseMotionListener, MouseListener {

	private Color c = Color.white;

	MHShape x = null;

	private Color shapecolor = Color.black;

	private Color penColor = Color.black;
	private int penSize = 2;

	private InfoPanel Info;
	private int ShapeType = 1;

	private MHShape shapes[] = new MHShape[1000];
	private int cShapesAll = 0;
	private int cShapes = 0;

	private int x1, y1;

	public DrawPanel(InfoPanel Info) {
		super();
		setOpaque(true);
		setPreferredSize(new Dimension(MHMMain.GWIDTH - 500, MHMMain.GHEIGHT - 200));
		this.Info = Info;
		this.setLayout(new FlowLayout());
		this.addMouseMotionListener(this);
		this.addMouseListener(this);

		if (MHMMain.Mode == 0)
			c = new Color(255, 255, 255);
		else
			c = new Color(125, 125, 125);

	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);

		gInsialize(g);

		for (int i = 0; i < cShapes; i++) {
			shapes[i].Draw(g);
		}

	}

	private void gInsialize(Graphics g) {
		g.setColor(Color.cyan);
		g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);

		g.setColor(c);
		g.fillRect(2, 2, getWidth() - 3, getHeight() - 3);
	}

	public void setShapeTools(int tNo) {
		this.ShapeType = tNo;
	}

	public void Clear() {
		cShapes = 0;
		repaint();
	}

	public void UndoClear() {
		cShapes = cShapesAll;
	}

	public void Undo() {
		if (cShapes > 0)
			cShapes--;
		repaint();
	}

	public void Redo() {
		if (cShapes < cShapesAll)
			cShapes++;
		repaint();
	}

	public void setPenColorSize(Color c, int size) {
		this.penColor = c;
		this.penSize = size;
	}

	public void setShapeColor(Color c) {
		this.shapecolor = c;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Info.setinfo("" + e.getX(), "" + e.getY(), 0);

		if (ShapeType == ShapeTools.Pencil) {
			((MHPen) shapes[cShapes - 1]).setNextPoint(new Point(e.getX(), e.getY()));
			repaint();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Info.setinfo("" + e.getX(), "" + e.getY(), 0);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Info.setinfo("" + e.getX(), "" + e.getY(), 1);
		x1 = e.getX();
		y1 = e.getY();

		if (ShapeType == ShapeTools.Pencil) {
			if (ShapeType == ShapeTools.Pencil)
				x = new MHPen(penColor, 1, 1, penSize);

			((MHPen) x).setNextPoint(new Point(e.getX(), e.getY()));
			shapes[cShapes++] = x;
			cShapesAll++;
			// cPPP++;
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Info.setinfo("" + e.getX(), "" + e.getY(), 2);

		if (ShapeType == ShapeTools.Line)
			x = new MHlines(x1, y1, e.getX(), e.getY(), 1, shapecolor, 1);

		if (ShapeType == ShapeTools.Rect)
			x = new MHRect(x1, y1, e.getX(), e.getY(), 1, shapecolor, 1, false, Color.red);

		if (ShapeType == ShapeTools.filledRect)
			x = new MHRect(x1, y1, e.getX(), e.getY(), 1, shapecolor, 1, true, shapecolor);

		if (ShapeType == ShapeTools.Oval)
			x = new MHOval(x1, y1, e.getX(), e.getY(), 1, shapecolor, 1, false, Color.red);

		if (ShapeType == ShapeTools.filledOval)
			x = new MHOval(x1, y1, e.getX(), e.getY(), 1, shapecolor, 1, true, shapecolor);

		if (ShapeType == ShapeTools.Triangle)
			x = new MHTriangle(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true, shapecolor);

		if (ShapeType == ShapeTools.Dimond)
			x = new MHDimond(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true, shapecolor);

		if (ShapeType == ShapeTools.Cube)
			x = new MHCube(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true, shapecolor);

		if (ShapeType == ShapeTools.Star)
			x = new MHStar(x1, y1, e.getX(), e.getY(), 1, Color.blue, 1, true, shapecolor);

		if (ShapeType != ShapeTools.Pencil) {
			shapes[cShapes++] = x;
			cShapesAll++;
		}
		this.repaint();

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public void setBackground(Color co) {
		this.c = co;

		repaint();
	}

}
