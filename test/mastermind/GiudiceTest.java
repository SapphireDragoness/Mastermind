package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiudiceTest {
	
	@Test
	void testValidaNumBulls () {
		assertEquals(0, Giudice.numBulls("1234", " 5678 "));
		assertEquals(1, Giudice.numBulls("1234", " 1876 "));
		assertEquals(1, Giudice.numBulls("1234", " 9874 "));
		assertEquals(1, Giudice.numBulls("1234", " 9243 "));
		assertEquals(1, Giudice.numBulls("9876", " 5573 "));
		assertEquals(2, Giudice.numBulls("1234", " 1256 "));
		assertEquals(2, Giudice.numBulls("1234", " 1537 "));
		assertEquals(2, Giudice.numBulls("1234", " 1764 "));
		assertEquals(2, Giudice.numBulls("1234", " 8237 "));
		assertEquals(2, Giudice.numBulls("1234", " 9834 "));
		assertEquals(3, Giudice.numBulls("9264", " 9261 "));
		assertEquals(3, Giudice.numBulls("9264", " 9284 "));
		assertEquals(3, Giudice.numBulls("9264", " 9764 "));
		assertEquals(3, Giudice.numBulls("9264", " 5264 "));
		assertEquals(4, Giudice.numBulls("9264", " 9264 "));
		assertEquals(4, Giudice.numBulls("8725", " 8725 "));
	}
	
	@Test
	void testValidaNumMaggots() {
		assertEquals(0, Giudice.numMaggots("1234", " 5678 "));
		assertEquals(1, Giudice.numMaggots("1234", " 8176 "));
		assertEquals(1, Giudice.numMaggots("1234", " 2956 "));
		assertEquals(1, Giudice.numMaggots("1234", " 2434 "));
		assertEquals(1, Giudice.numMaggots("9876", " 3921 "));
		assertEquals(2, Giudice.numMaggots("1234", " 5612 "));
		assertEquals(2, Giudice.numMaggots("1234", " 1243 "));
		assertEquals(2, Giudice.numMaggots("1234", " 4761 "));
		assertEquals(2, Giudice.numMaggots("1234", " 7382 "));
		assertEquals(2, Giudice.numMaggots("1234", " 3498 "));
		assertEquals(3, Giudice.numMaggots("9264", " 1629 "));
		assertEquals(3, Giudice.numMaggots("9264", " 8492 "));
		assertEquals(3, Giudice.numMaggots("9264", " 2639 "));
		assertEquals(3, Giudice.numMaggots("9264", " 8946 "));
		assertEquals(4, Giudice.numMaggots("9264", " 6429 "));
		assertEquals(4, Giudice.numMaggots("8725", " 5278 "));
	}
	
}
