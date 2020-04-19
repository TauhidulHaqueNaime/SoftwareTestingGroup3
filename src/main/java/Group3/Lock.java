package Group3;

public class Lock {
	private int KeyValue;
	private boolean locked;
	
	public Lock(int KeyValue) {
		this.KeyValue=KeyValue;
		locked=true;
	}
	
	public boolean Unlock (int KeyValue) {
		if (this.KeyValue == KeyValue) {
			locked= false;
			return true;
		}
		
		locked = true;
		return false;
	}
	
	public void lock() {
		locked = true;
	}
	
	public boolean isLocked() {
		
		return locked;
	}

}
