package demo01;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSum {

	@Test
	public void testSumTresNumeros() {
		assertEquals(12, Sum.suma3Nums(8, 1, 3));
	}
	
	
	@Test
	public void testSumDosNumeros() {
		assertEquals(14, Sum.suma2Nums(8, 6));
	}

}
