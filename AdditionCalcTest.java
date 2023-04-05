import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionCalcTest {

	@Test
	public void testAddition() {
		int output = CalcTest.addition(9,9);
		assertEquals(18,output);
	
		
	}

}
