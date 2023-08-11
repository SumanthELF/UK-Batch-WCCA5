
public class Employee {

	private int id;
	private String name;
	private String email;
	
	public Employee(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
