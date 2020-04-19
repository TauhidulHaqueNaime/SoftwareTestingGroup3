package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegrationTest {

	// integration testing using LockUnlock and Lock Test
	@Test
	public void IntegrationKeyTest() {
		LockUnlock junit= new LockUnlock();
		
		junit.SetName("Name");
		junit.SetId(10);
		junit.SetSecret(5);
		
		Lock lock= new Lock (50);
		assertEquals(true, lock.Unlock(junit.CalculateKey()));
		assertEquals (false,lock.isLocked());
		
		lock.lock();
		
		junit.SetSecret(30);
		assertEquals(false, lock.Unlock(junit.CalculateKey()));
		assertEquals (true,lock.isLocked());
	}

}
