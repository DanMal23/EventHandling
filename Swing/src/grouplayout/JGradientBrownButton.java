package grouplayout;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JButton;

public class JGradientBrownButton extends JButton {
	JGradientBrownButton(String text) {
		super(text);
		setContentAreaFilled(false);
		setFocusPainted(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g.create();
		g2d.setPaint(new GradientPaint(new Point(0, 0), Color.WHITE, new Point(0, getHeight()),
				Color.getHSBColor(26, 16, 30).darker()));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.dispose();

		super.paintComponent(g);
	}

	public static JGradientBrownButton newInstance(String text) {
		return new JGradientBrownButton(text);
	}
}
