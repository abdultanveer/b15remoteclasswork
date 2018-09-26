package basics;

//instructions -- file in HDD
public class Student extends Human{
	public static String COLLEGE_NAME ;// static variable
	
	static {
		COLLEGE_NAME = "IIT";
		System.out.println("inside static block");
	}
	
	
	/*public static void main(String[] args) {
		System.out.println("inside main method");

	}*/
	
	//String nameOfStudent; //instance variable
	//int age;
	int salary;
	int marks;
	char grade;
	Address address;
	
	
	
	public Student(String nameOfStudent, int age, int salary, int marks, char grade) {
		super(nameOfStudent,age);
		//this.nameOfStudent = nameOfStudent;
		//this.age = age;
		this.salary = salary;
		this.marks = marks;
		this.grade = grade;
	}

	public Student( int salary, int marks, char grade) {
		//super(nameOfStudent,age);
		//this.nameOfStudent = nameOfStudent;
		//this.age = age;
		this.salary = salary;
		this.marks = marks;
		this.grade = grade;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student getStudent(Student student){
		return this;
	}



	public static void  getMarks() {
		int a = 10; // a == local variable
		//salary = 550;
		COLLEGE_NAME = "abc";
	}
	
	public static void main(String[] args) {
		/*Student student = new Student();
		student.getStudent(this);*/
	}

}
