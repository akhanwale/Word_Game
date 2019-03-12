import java.io.*;
import java.util.*;

/*
 * Main driver for arcades
 */
public class GameDriver {
	static HashMap<String, String> test = new HashMap<String, String>();
	
	
	static HashMap<String, String> dictionary = new HashMap<String, String>();
	public GameDriver() {
		
	}
	public static void main(String[] args) {
		scan();
		input();
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
			
			System.out.println(dictionary.size());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
	}
	public static void input() {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext() || test.size() == 10) {
			String word = s.next();
			test.put(word, word);
			System.out.println(test.size());
		}
	}
	

}
