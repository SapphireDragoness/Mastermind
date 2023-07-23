package mastermind;

import java.util.Random;

public class Computer extends Giocatore {

	public Computer() {
		super();
	}
	
	@Override
	public String genGuess() {
		return genValidCombination();
	}
	
	@Override
	public String genTarget() {
		return genValidCombination();
	}

	private String genValidCombination() {
		Random random = new Random();
		String target = String.valueOf(random.nextInt(10000));
		if(!valida(target)) return genValidCombination();
		else return target;
	}
	
}
