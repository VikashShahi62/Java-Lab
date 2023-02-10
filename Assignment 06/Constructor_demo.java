package oops__Concept;


class Student1{
	int id;
	String name, address;
	long phone;
	static String institute= "Anudip Foundation"; //Static Variable
	
	public Student1(int id, String name, String address, long phone) //Parameterized Constructor
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile no: "+phone);
		System.out.println("Institute: "+institute);
	}
	
	public static void changeInstituteName()  //static method
	{
		institute="Anudip Foundation for Social Welfare.";
	}
}

public class Constructor_demo {

	public static void main(String[] args) {
		Student1 stu1 = new Student1(101, "Akash", "Ranchi", 620091654);
		stu1.display();
		System.out.println("--------------------------------------------------");
		Student1.changeInstituteName();
		Student1 stu2 = new Student1(103, "Ankush", "Sili ", 234567890);
		stu2.display();
	}

}