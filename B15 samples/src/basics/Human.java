package basics;

public class Human {
	String name;
	int age;
	
	public Human() {}
	
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

}
