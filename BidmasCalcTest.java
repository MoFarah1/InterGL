import static org.junit.Assert.*;

import org.junit.Test;

public class BidmasCalcTest {

	@Test
	public void testBidmas() {
		int output = CalcTest.bidmas(1,2,3);
		assertEquals(9,output);
	}

}
