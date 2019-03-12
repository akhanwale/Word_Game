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
		scan();
	}
	public static void scan() {
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
	
}
