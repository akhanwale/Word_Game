import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Main driver for arcades
 */
public class GameDriver extends JPanel implements ActionListener, MouseListener, KeyListener{
	
	
	
	static HashMap<Integer, String> dictionary = new HashMap<Integer, String>();
	public GameDriver() {
		
	}
	public static void main(String[] args) {
		
		
	}
	public static void dictScan() {
		File dict = new File("Game_Dictionary");
		int i = 0; 
		try {
			Scanner dictionaryScan = dictionaryScan = new Scanner(dict);
			while(dictionaryScan.hasNext()) {
			String word = dictionaryScan.next().trim();
				
				dictionary.put(i,word);
				i++;
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
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
