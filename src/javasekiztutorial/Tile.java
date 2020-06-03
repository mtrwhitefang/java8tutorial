package javasekiztutorial;

import java.awt.Color;

public class Tile {

	private int tileXStart, tileYStart,randomNumber;
	private Color color;

	// CONSTRUCTOR
	public Tile(int tileXStart, int tileYStart, Color color,int randomNumber) {
		this.tileXStart = tileXStart;
		this.tileYStart = tileYStart;
		this.color=color;
		this.randomNumber=randomNumber;
	}

	// GETTERS - SETTERS

	public Color getColor() {
		return color;
	}

	public int getTileXStart() {
		return tileXStart;
	}

	public void setTileXStart(int tileXStart) {
		this.tileXStart = tileXStart;
	}

	public int getTileYStart() {
		return tileYStart;
	}

	public void setTileYStart(int tileYStart) {
		this.tileYStart = tileYStart;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	

}