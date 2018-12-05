package draw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawingLines extends MouseAdapter {
	Frame f;
	Button b1, b2, b3, b4, b5, b6, b7;
	Label lab1;

	DrawingLines() {
		f = new Frame("Drawing colorful lines");
		f.addMouseListener(this);

		f.setSize(380, 380);
		f.setLayout(null);
		f.setVisible(true);

		f.addWindowListener((WindowListener) new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		lab1 = new Label("Pick color and draw:");
		lab1.setBounds(20, 40, 190, 30);
		Font font = new Font("Verdana", Font.BOLD, 14);
		lab1.setFont(font);

		b1 = new Button("reset beige");
		b2 = new Button("reset white");
		b3 = new Button(" ");
		b4 = new Button(" ");
		b5 = new Button(" ");
		b6 = new Button(" ");
		b7 = new Button(" ");
		b1.setBackground(Color.getHSBColor(27, 16, 48).darker());
		b2.setBackground(Color.white);
		b3.setBackground(Color.gray.brighter());
		b4.setBackground(Color.blue.brighter());
		b5.setBackground(Color.green.darker());
		b6.setBackground(Color.red.darker());
		b7.setBackground(Color.orange.darker());

		b1.setBounds(20, 80, 80, 30);
		b2.setBounds(20, 120, 80, 30);
		b3.setBounds(20, 160, 40, 30);
		b4.setBounds(20, 200, 40, 30);
		b5.setBounds(20, 240, 40, 30);
		b6.setBounds(20, 280, 40, 30);
		b7.setBounds(20, 320, 40, 30);
		f.add(lab1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);

		b1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.gray);
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}

				});
			}
		});

		b4.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.blue);
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}

				});
			}
		});

		b5.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.green.darker());
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}

				});
			}
		});
		b6.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.red);
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}
				});
			}
		});
		b7.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Graphics g = f.getGraphics();
						g.setColor(Color.orange);
						g.fillOval(e.getX(), e.getY(), 10, 10);
					}
				});
			}
		});
	}

	public static void main(String[] args) {
		new DrawingLines();
	}
}
