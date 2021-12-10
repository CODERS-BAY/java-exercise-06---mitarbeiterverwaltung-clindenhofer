package application;

public class Department{
	String name;
	int id;
	String country;
	String city;
	
	public Department(String name, int id, String country, String city) {
		super();
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
	}
	
	public Department() {
		super();
		this.name = "test";
		this.id = 123;
		this.country = "Neverland";
		this.city = "Gotham";
	}
	
//	public void defaultDepartment(String name, int id, String country, String city) {
//		name = "Test";
//		id = 123;
//		country = "Neverland";
//		city = "Gotham";
//	}
	
//	public defaultDepartment2() {
//		name = "Test";
//		id = 123;
//		country = "Neverland";
//		city = "Gotham";
//	}
		
	
	
//	public boolean isEquals(Department other) {
//		if(id != Employee.i)
//		return false;
//	}

}
