package DSA.Java.Lists;

public class Employee {

	private String firstNAme;
	private String lastName;
	private int id;
	


	public Employee(String firstName, String lastName, int id) {
		this.setFirstNAme(firstName);
		this.setLastName(lastName);
		this.setId(id);
		// TODO Auto-generated constructor stub
	}


	public String getFirstNAme() {
		return firstNAme;
	}

	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Employee{"+
				"firstName= '" + firstNAme + '\''+
				" , lastName= '" + lastName + '\''+
				" , id= " + id +
				'}';
	}
	
}
