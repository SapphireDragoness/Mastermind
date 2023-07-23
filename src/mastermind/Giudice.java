package mastermind;

import java.util.ArrayList;
import java.util.Arrays;

public class Giudice {
	
	public final static int LUNGHEZZA = 4;
	public final static int TENTATIVI = 10;
	public final ArrayList<Character> CHARS = new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
	
	public static int numBulls(String guess, String target) {
		int c = 0;
		for(int i = 0; i < 4; i++) {
			if(target.trim().charAt(i) == guess.trim().charAt(i))
				c++;
		}
		return c;
	}
	
	public static int numMaggots(String guess, String target) {
		int c = 0;
		for(int i = 0; i < 4; i++) {
			if(target.indexOf(guess.charAt(i)) >= 0)
				c++;
		}
		
		return c - numBulls(guess, target);
	}
}
