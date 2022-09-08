
public class OnlineCustomer extends Customer{
	private String email;
	
	public OnlineCustomer(String name, String address, String email) {
		super(name, address);
		this.email = email;
	}
	public String toString() {
		return super.toString() + "\nEmail: " + email;
	}
}
