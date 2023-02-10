package oops__Concept;


public class Test_student_bean {

	public static void main(String[] args) {

		Student_Bean stu = new Student_Bean();
		stu.setFirstName("Akash");
		stu.setLastName("Pearson");
		stu.setId(307);
		stu.setAddress("Lohardaga");
		
		System.out.println(stu.getFirstName());
		System.out.println(stu.getLastName());
		System.out.println(stu.getId());
		System.out.println(stu.getAddress());
		
		System.out.println();
		
		Student_Bean stud = new Student_Bean();
		stud.setFirstName("Kashish");
		stud.setLastName("Sahu");
		stud.setAddress("Gumla");
		stud.setId(357);
		
		System.out.println(stud.getFirstName());
		System.out.println(stud.getLastName());
		System.out.println(stud.getId());
		System.out.println(stud.getAddress());
		
	}

}