package Group3;

public class LockUnlock {
	private String name;
	private int Id;
	private int secret;
	
	public int CalculateKey() {
		return Id*secret;
	}
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name= name;
	}
	
	public int getId() {
		return Id;
	}
	
	public void SetId(int Id) {
		this.Id= Id;
	}
	
	public int getSecret() {
		return secret;
	}
	public void SetSecret (int secret) {
		this.secret=secret;
	}
}
