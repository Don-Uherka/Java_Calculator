package constructor;

public class Person {
	//attributes
	String name;
	int age;
	String gender;
	
	
	
	
	//Constructor
	public Person(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//Methods
	
	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

}
