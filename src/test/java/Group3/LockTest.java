package Group3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LockTest {

	@Test
	public void lockTest() {
		Lock lock= new Lock(50);
		assertEquals (true, lock.isLocked());
		
		assertEquals (true,lock.Unlock(50));
		assertEquals (false, lock.isLocked());
		
		lock.lock();
		assertEquals (true, lock.isLocked());
		
		assertEquals (false,lock.Unlock(10));
		assertEquals (true, lock.isLocked());
		
		
	}

}
