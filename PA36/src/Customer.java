public class Customer {
	private String name;
	private String address;

	public Customer(String n, String a) {
		name = n;
		address = a;
	}

	public String toString() {
		return "Name: " + name + "\nAddress: " + address;
	}
}