package fatec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinomial {
	private Binomial bnm;
	
	@Before
	public void setUp() {
		bnm = new Binomial();
	}
	@Test
	public void test() throws Exception {
		bnm.bmn(5, 2, "1/2", "1/2");
		assertEquals(bnm.P(2),0.3125,0);
	}
	
	
	
	
}
