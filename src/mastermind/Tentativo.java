package mastermind;

public class Tentativo {
	
	private final String guess;
	private final int numBulls;
	private final int numMaggots;
	
	public Tentativo(String guess, int numBulls, int numMaggots) {
		this.guess = guess;
		this.numBulls = numBulls;
		this.numMaggots = numMaggots;
	}

	public String getGuess() {
		return guess;
	}

	public int getNumBulls() {
		return numBulls;
	}

	public int getNumMaggots() {
		return numMaggots;
	}
	
	@Override
	public String toString() {
		return "T: " + guess + ", B: " + numBulls + ", M: " + numMaggots;
	}
	
}
