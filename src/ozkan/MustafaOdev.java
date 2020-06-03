package ozkan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MustafaOdev extends JFrame {

	private static final long serialVersionUID = 1L;

	public MustafaOdev() {
		super("Mustafa ERDOÐAN");

		getContentPane().setBackground(Color.WHITE);
		setSize(550, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	void drawRectangles(Graphics g, Tile tile) {
		Graphics2D g2d = (Graphics2D) g;

		// code to draw rectangles goes here...
		int x = tile.getTileXStart();
		int y = tile.getTileYStart();
		int randomNumber = tile.getRandomNumber();
		Color color = tile.getColor();

		int width = 50;
		int height = 50;

		g2d.setColor(color);

		g2d.fillRect(width / 2 + x * (width), height / 2 + y * (height), width, height);
		if (color == Color.white) {
			g2d.setColor(Color.black);

		} else {
			g2d.setColor(Color.white);

		}

		g2d.drawString(Integer.toString(randomNumber), width * 85 / 100 + x * (width),
				height * 105 / 100 + y * (height));
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				Tile tile = new Tile(x, y, this.randomColor(), this.randomNumber());
				drawRectangles(g, tile);
			}
		}

	}

	public Color randomColor() {
		Random rand = new Random();

		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();

		Color randomColor = new Color(r, g, b);

		return randomColor;
	}

	public int randomNumber() {

		int min = 0;
		int max = 100;
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MustafaOdev().setVisible(true);

			}
		});
	}
}