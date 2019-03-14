import java.io.*;
import java.util.*;

/*
 * Main driver for arcades
 */
public class GameDriver {
	
	
	
	static HashMap<String, String> dictionary = new HashMap<String, String>();
	public GameDriver() {
		
	}
	public static void main(String[] args) {
		
		
	}
	public static void dictScan() {
		File dict = new File("Game_Dictionary");
		
		try {
			Scanner dictionaryScan = dictionaryScan = new Scanner(dict);
			while(dictionaryScan.hasNext()) {
			String word = dictionaryScan.next().trim();
				
				dictionary.put(word,word);
			}
			dictionaryScan.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static char[][] crosswordScan(int puzzlenum) {
		File f = new File("Crossword_" + Integer.toString(puzzlenum));
		char[][]board = null;
		try {
			Scanner s = new Scanner(f);
			int r = s.nextInt();
			int c = s.nextInt();
			board = new char[r][c];
			int j = 0;
			String g = s.nextLine();
			while(s.hasNextLine()) {
				String line = s.nextLine();
				for(int i = 0; i < board.length; i++) {
					board[i][j] = line.charAt(i);
				}
				j++; 
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return board;
	}
	public static void wordHuntScan() {
		
	}
	
	
	
}
