package MHShapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MHShape {

	public Color borderColor;
	public int width;
	public int dashtype;

	public void Draw(Graphics g) {

	}

	public Color getBordercolor() {
		return borderColor;
	}

	public void setBordercolor(Color bordercolor) {
		this.borderColor = bordercolor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDashtype() {
		return dashtype;
	}

	public void setDashtype(int dashtype) {
		this.dashtype = dashtype;
	}
}
