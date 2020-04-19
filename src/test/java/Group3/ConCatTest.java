package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void ConCatingTest() {
		ConCat junit= new ConCat();
		String result= junit.ConCating("Hello", "World");
		assertEquals ("HelloWorld", result);		
	}

}