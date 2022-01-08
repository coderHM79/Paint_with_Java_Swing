package MHPaintSetting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import MHPaintClasses.BackgroundPanel;

public class BGroundColor extends JPanel {

	private BackgroundPanel back;

	public BGroundColor() {
		super();
		this.setPreferredSize(new Dimension(200, 200));
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setVisible(false);
	}

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

}
