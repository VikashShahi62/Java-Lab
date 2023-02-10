package oops__Concept;


class Employee{
	int id;
	String name,city,country,state,designation;
	final int aadhar;
	long phone,salary;
	
	public Employee(int id, String name, String city, int aadhar)
	{
		this.id=id;
		this.name=name;
		this.city= city;
		this.aadhar=aadhar;
	}
	
	public Employee(int id, String name, String city, int aadhar,
			String country,String state)
	{
		this(id,name,city,aadhar);
		this.country= country;
		this.state=state;
	}
	
	public Employee(int id, String name, String city, int aadhar,
			String country,String state,long salary,
			long phone,String designation)
	{
		this(id,name,city,aadhar,country,state);
		this.phone=phone;
		this.salary=salary;
		this.designation=designation;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", aadhar=" + aadhar + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}

	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Aadhar No.: "+aadhar);
		System.out.println("State: "+state);
		System.out.println("Country: "+country);
	}
	
	
}

public class Constructor_overloading {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Shawin", "Darjeeling", 123456789);
		//employee1.display();
		System.out.println(employee1);
		System.out.println();
		
		Employee employee2 = new Employee(2, "Akash", "Ranchi", 987654321, "India", "Jharkhand");
		//employee2.display();
		System.out.println(employee2);
		System.out.println();
		
		Employee employee3 = new Employee(3, "Vikaash", "Chuita", 869635123, "India", "Jharkhand", 35000, 620093470, "Developer");
		System.out.println(employee3);

	}

}