package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LockUnlockTest {

	@Test
	public void lockunlockTest() {
		LockUnlock junit= new LockUnlock();
		junit.SetId(10);
		junit.SetSecret(5);
		junit.SetName ("Secret Key is:");
		
		assertEquals (junit.CalculateKey(),50);
	}

}
