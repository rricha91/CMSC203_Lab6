import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
 private GradeBook g1;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(69.69);
		g1.addScore(420.69);
	}

	void addScoreTest() {
		assertTrue(g1.toString().equals("69.69 420.69"));
	}
	
	void testSum() {
		assertEquals(490.38, g1.sum(), .0001);
	}
	
	void testMin() {
		assertEquals(69.69, g1.minimum(), .001);
	}
	
	void testFinal() {
		assertEquals(420.69, g1.finalScore(), .001);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
