package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UmanoTest {

//	@Test
//	void testCostruttore() {
//		Umano umano1 = new Umano();
//		
//		assertEquals(umano1.tentativi.size(), 0);	
//	}

	@Test 
	void testAddTentativo() {
		Umano umano1 = new Umano();
		
		umano1.addTentativo("1234", 1, 0);
		umano1.addTentativo("1234", 3, 0);
		umano1.addTentativo("1234", 0, 4);
		umano1.addTentativo("1234", 0, 4);
		umano1.addTentativo("1234", 2, 2);
		
		assertEquals(umano1.tentativi.size(), 5);
	}
	
	@Test 
	void testStringaTentativi() {
		Umano umano1 = new Umano();
		
		umano1.addTentativo("1234", 1, 0);
		umano1.addTentativo("1234", 3, 0);
		umano1.addTentativo("1234", 0, 4);
		umano1.addTentativo("1234", 0, 4);
		umano1.addTentativo("1234", 2, 2);
		
		System.out.println(umano1.stringaTentativi());
	}
	
}
