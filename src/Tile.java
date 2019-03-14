/*
 * This is the class with tiles, for each individual game
 */
public class Tile {
	private char tLetter;
	private char letter;
	private int ycoord;
	private int xcoord;


	//wordHunt
	public Tile(char CChar, int row, int column) {
		letter = CChar;
		ycoord = row;
		xcoord = column;

	}
	//anagram
	public Tile(char CChar, int column) {
		letter = CChar;
		xcoord = column;
	}

	//crossword
	public Tile(char target, char eChar, int row, int col) {
		tLetter = target;
		letter = eChar; 
		ycoord = row;
		xcoord = col;
	}
	public char gettLetter() {
		return tLetter;
	}
	public void settLetter(char tLetter) {
		this.tLetter = tLetter;
	}
	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public int getYcoord() {
		return ycoord;
	}
	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}
	public int getXcoord() {
		return xcoord;
	}
	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}
}

