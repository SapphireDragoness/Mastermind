package mastermind;

import jbook.util.Input;

public class Umano extends Giocatore {

	public Umano() {
		super();
	}
	
	@Override
	public String genGuess() {
		String guess = Input.readString("Inserire guess: ");;
		if(!valida(guess)) {
			System.out.println("Formato non valido");
			return genTarget();
		}
		return guess;
	}

	@Override
	public String genTarget() {
		String target = Input.readString("Inserire target: ");
		if(!valida(target)) {
			System.out.println("Formato non valido");
			return genTarget();
		}
		return target;
	}

}
