package basics;

public class Manager {
	
	public static void main(String[] args) {
		String name= Student.COLLEGE_NAME;
		System.out.println("college name = "+name);
		//Student.getMarks();
		//box -- RAM -  allocate
		/*Student b15 = new Student();//default constructor
		b15.nameOfStudent = "sandra";
		b15.age = 123;
		b15.grade = 'a';
		b15.marks = 321;
		b15.salary = 123;*/
		
		Student san = new Student("sandra",123,321,123,'a');
		
		//new Student()
	}

}
