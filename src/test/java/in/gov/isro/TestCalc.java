package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calculator calc=new Calculator();
		int result=calc.add(5,5);
		assertEquals(10,result);
	}

	@Test
	public void testmultiply() {
		Calculator calc=new Calculator();
		int result=calc.multiply(10,5);
		assertEquals(50,result);
	}
	@Test
	public void testsub() {
		Calculator calc=new Calculator();
		int result=calc.sub(10,5);
		assertEquals(5,result);
	}
}
