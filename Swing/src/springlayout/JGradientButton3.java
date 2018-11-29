package springlayout;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class JGradientButton3 extends JButton {
	Color color1;
	Color color2;

	JGradientButton3(String text, Color color1, Color color2) {
		super(text);
		this.color1 = color1;
		this.color2 = color2;
		setContentAreaFilled(false);
		setFocusPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g.create();
		g2d.setPaint(new GradientPaint(new Point(0, 0), color1, new Point(0, getHeight()), color2));
		int width = getWidth();
		int height = getHeight();
		Paint gradient = new GradientPaint(0, 5, color1, width, height, color2);
		g2d.setPaint(gradient);
		g2d.fillRect(2, 2, width, height);

		super.paintComponent(g);
	}

	public static JGradientButton3 newInstance(String text, Color color1, Color color2) {
		return new JGradientButton3(text, color1, color2);
	}
}
