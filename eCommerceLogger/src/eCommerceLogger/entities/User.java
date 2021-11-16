package eCommerceLogger.entities;

public class User { //fieldlar, constructorlar ve get/set tamam.
	
	private String firstName;
	private String lastName;
	private int natId;
	private String email;
	private String password;
	
	public User(String firstName, String lastName, int natId, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.natId = natId;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNatId() {
		return natId;
	}

	public void setNatId(int natId) {
		this.natId = natId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
