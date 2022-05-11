import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calcolatriceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	public void testSomma() {
		calcolatrice c = new calcolatrice();
		int a=5, b=3;
		int s = c.somma(a, b);
		assertEquals("somma non corretta",8,s);
		
	}
}
