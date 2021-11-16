package eCommerceLogger.entities.concretes;

public class User { //constructorlar ve getter setterlar verildi.
	
	private String firstName;
	private String lastName;
	private int idNo;
	private String eMail;
	private String password;
	
	public User(String firstName, String lastName, int idNo, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNo = idNo;
		this.eMail = eMail;
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
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

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	

}
