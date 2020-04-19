package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void addTest() {
		calculator junit= new calculator();
		int result= junit.add(200, 100);
		assertEquals (300,result);
	}
	
	@Test
	
	public void subTest() {
		calculator junit= new calculator();
		int result= junit.sub(300, 100);
		assertEquals (200,result);
	}
	
	@Test
	
	public void mulTest() {
		calculator junit= new calculator();
		int result= junit.mul(20, 20);
		assertEquals (400,result);
	}
	
	@Test
	
	public void divTest() {
		calculator junit= new calculator();
		int result= junit.div(8, 4);
		assertEquals (2,result);
	}
	
	@Test
	public void squareTest() {
		calculator junit= new calculator();
		int result= junit.square(5);
		assertEquals(25, result);
		
	}

}
