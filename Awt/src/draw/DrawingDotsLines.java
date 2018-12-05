package draw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawingDotsLines extends MouseAdapter {
	Frame f;
	Button b1, b2, b3, b4, b5, b6, b7;

	DrawingDotsLines() {
		f = new Frame("abstract drawings");
		f.addMouseListener(this);

		f.setSize(350, 350);
		f.setLayout(null);
		f.setVisible(true);

		f.addWindowListener((WindowListener) new WindowAdapter() {

			public void windowClosing(WindowEvent e) { // added - closes the window !!!
				f.dispose();
			}
		});

		b1 = new Button("beige bg");
		b2 = new Button("white bg");
		b3 = new Button("gray squares");
		b4 = new Button("small dots");
		b5 = new Button("dots");
		b6 = new Button("draw lines");
		b7 = new Button("draw lines");
		b1.setBackground(Color.gray.darker());
		b2.setBackground(Color.white);
		b3.setBackground(Color.gray.brighter());
		b5.setBackground(Color.cyan.darker());
		b1.setBounds(20, 40, 90, 30);
		b2.setBounds(20, 80, 90, 30);
		b3.setBounds(20, 120, 90, 30);
		b4.setBounds(20, 160, 90, 30);
		b5.setBounds(20, 200, 90, 30);
		b6.setBounds(20, 240, 90, 30);
		b7.setBounds(20, 280, 90, 30);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);

		b1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setBackground(Color.getHSBColor(27, 16, 48).darker());
				f.setBackground(Color.getHSBColor(27, 16, 48).darker());
			}

		});
		b2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setBackground(Color.white);
			}

		});
		b3.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.gray.brighter());
						g.fillRect(e.getX(), e.getY(), 30, 30);
					}

				});
			}
		});

		b4.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(
								Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));

						g.fillOval(e.getX(), e.getY(), 10, 10);
					}

				});
			}
		});

		b5.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.cyan.darker());
						g.fillOval(e.getX(), e.getY(), 20, 20);
					}

				});
			}
		});
		b6.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setBackground(Color.ORANGE);
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();

						g.setColor(Color.ORANGE.darker());
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}
				});
			}
		});
		b7.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7.setBackground(Color.getHSBColor(345, 93, 16).darker());
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();

						g.setColor(Color.getHSBColor(345, 93, 16).darker());
						g.fillRect(e.getX(), e.getY(), 10, 10);
					}
				});
			}
		});
	}

	public void mouseClicked(MouseEvent e) {
		Graphics g = f.getGraphics();
		g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));

		g.fillOval(e.getX(), e.getY(), 30, 30);
	}

	public static void main(String[] args) {
		new DrawingDotsLines();
	}
}
