package MHShapes;

import java.awt.Color;
import java.awt.Graphics;

public class MHRectShape extends MH2shape {
	private Boolean isFilled;
	private Color backcolor;

	public void Draw(Graphics g) {

	}

	public Boolean getIsFilled() {
		return isFilled;
	}

	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Color getBackcolor() {
		return backcolor;
	}

	public void setBackcolor(Color backcolor) {
		this.backcolor = backcolor;
	}
}
