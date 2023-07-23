package mastermind;

import java.util.ArrayList;

public abstract class Giocatore {
	
	public String target;
	public ArrayList<Tentativo> tentativi;
	
	public Giocatore() {
		inizializza();
	}
	
	public void inizializza() {
		target = genTarget();
		tentativi = new ArrayList<Tentativo>();
	}

	public String getTarget() {
		return target;
	}
	
	public void addTentativo(String guess, int bulls, int maggots) {
		tentativi.add(new Tentativo(guess, bulls, maggots));
	}
 	
	public String stringaTentativi() {
		return tentativi.toString();			
	}
	
	public abstract String genGuess();
	
	public abstract String genTarget();
	
	public boolean valida(String string) {
		return (string.length() == 4 && caratteriGiusti(string) && !caratteriNonRipetuti(string)); 
	}

	private boolean caratteriNonRipetuti(String s) {
		return s.length() != s.chars().distinct().count();
	}

	private boolean caratteriGiusti(String s) {
		return s.matches("^[0-9]+$");
	}
	
}
