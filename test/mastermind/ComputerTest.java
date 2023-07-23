package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputerTest {

	@Test
	void testCostruttore() {
		Computer computer1 = new Computer();
		
		assertEquals(computer1.tentativi.size(), 0);
	} 
	
	@Test 
	void testAddTentativo() {
		Computer computer1 = new Computer();
		
		computer1.addTentativo(computer1.genGuess(), 1, 0);
		computer1.addTentativo(computer1.genGuess(), 3, 0);
		computer1.addTentativo(computer1.genGuess(), 0, 4);
		computer1.addTentativo(computer1.genGuess(), 0, 4);
		computer1.addTentativo(computer1.genGuess(), 2, 2);
		
		assertEquals(computer1.tentativi.size(), 5);
	}
	
	@Test 
	void testStringaTentativi() {
		Computer computer1 = new Computer();
		
		computer1.addTentativo(computer1.genGuess(), 1, 0);
		computer1.addTentativo(computer1.genGuess(), 3, 0);
		computer1.addTentativo(computer1.genGuess(), 0, 4);
		computer1.addTentativo(computer1.genGuess(), 0, 4);
		computer1.addTentativo(computer1.genGuess(), 2, 2);
		
		System.out.println(computer1.stringaTentativi());
	}
	
}
