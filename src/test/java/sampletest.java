import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sampletest {

	@Test
	public void simpletestpass() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}

	@Test
	public void simpletestfail() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 4);
	}
}
