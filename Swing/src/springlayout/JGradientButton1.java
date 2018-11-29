package springlayout;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JButton;

public class JGradientButton1 extends JButton {
	Color color1;
	Color color2;

	JGradientButton1(String text, Color c1, Color c2) {
		super(text);
		this.color1 = c1;
		this.color2 = c2;
		setContentAreaFilled(false);
		setFocusPainted(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g.create();
		g2d.setPaint(new GradientPaint(new Point(0, 0), Color.WHITE, new Point(0, getHeight()),
				Color.getHSBColor(157, 28, 69).darker()));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.dispose();

		super.paintComponent(g);
	}

	public static JGradientButton1 newInstance(String text, Color color1, Color color2) {
		return new JGradientButton1(text, color1, color2);
	}
}
