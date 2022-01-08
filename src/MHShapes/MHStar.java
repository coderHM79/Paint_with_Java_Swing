package MHShapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MHStar extends MHRectShape {
	public MHStar(int x1, int y1, int x2, int y2, int width, Color bordercolor, int dashtype, Boolean isFilled,
				  Color backColor) {
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
		this.setWidth(width);
		this.setDashtype(dashtype);
		this.setBordercolor(bordercolor);
		this.setBackcolor(backColor);
		this.setIsFilled(isFilled);

	}

	public void Draw(Graphics g) {

		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(this.getBordercolor());
		if (getIsFilled()) {
			g.setColor(getBackcolor());
			g.drawLine(((getX2() - getX1()) / 2 + getX1()), getY1(), getX2(), getY2());
			g.drawLine(((getX2() - getX1()) / 2 + getX1()), getY1(), getX1(), getY2());
			g.drawLine(getX2(), ((getY2() - getY1()) / 2 + getY1()), getX1(), getY2());
			g.drawLine(getX2(), ((getY2() - getY1()) / 2 + getY1()), getX1(), ((getY2() - getY1()) / 2 + getY1()));
			g.drawLine(getX2(), getY2(), getX1(), ((getY2() - getY1()) / 2 + getY1()));

			g.setColor(getBordercolor());
		} else {
			g.setColor(getBackcolor());
			g.drawLine(((getX2() - getX1()) / 2 + getX1()), getY1(), getX2(), getY2());
			g.drawLine(((getX2() - getX1()) / 2 + getX1()), getY1(), getX1(), getY2());
			g.drawLine(getX2(), ((getY2() - getY1()) / 2 + getY1()), getX1(), getY2());
			g.drawLine(getX2(), ((getY2() - getY1()) / 2 + getY1()), getX1(), ((getY2() - getY1()) / 2 + getY1()));
			g.drawLine(getX2(), getY2(), getX1(), ((getY2() - getY1()) / 2 + getY1()));

			g.setColor(getBordercolor());
		}

	}

}
