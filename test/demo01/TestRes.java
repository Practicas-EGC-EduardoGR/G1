package demo01;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRes {

	@Test
	public void testResDosNumeros() {
		assertEquals(3, Res.resta2Nums(9, 6));
	}

}
