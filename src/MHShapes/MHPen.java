package MHShapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class MHPen extends MH2shape {
	public Point points[] = new Point[1000];
	public int cPoints;

	private Color c;
	private int Size;

	public MHPen(Color bordercolor, int width, int dashtype, int size) {
		cPoints = 0;
		setBordercolor(bordercolor);
		setWidth(width);
		setDashtype(dashtype);
		this.c = bordercolor;
		this.Size = size;
	}

	public void Draw(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(c);
		g2.setStroke(new BasicStroke(Size));
		for (int i = 0; i < cPoints - 1; i++)
			g2.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);

	}

	public void setNextPoint(Point p) {
		points[cPoints++] = new Point(p);
	}

}
