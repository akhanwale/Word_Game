/*
 * This is the class with tiles, for each individual game
 */
public class Tile {

private char letter;
private int row;
private int column; 


public Tile(char CChar, int xpos, int ypos) {
	letter = CChar;
	row = xpos;
	column = ypos;

}

public Tile(char CChar, int ypos) {
	letter = CChar; 
	column = ypos; 
}



	
	
}
