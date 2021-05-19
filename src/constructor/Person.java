package constructor;

public class Person {
	//attributes
	public String name;
	private int age = 24;
	String gender;
	
	
	
	
	//Constructor
	public Person(String name, String gender) {
		this.name = name;
		
		this.gender = gender;
	}
	
	//Methods
	
	public String speak(String msg) {
		return this.name + " says: " + msg;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int setAge(int newAge) {
		return this.age = newAge;
	}
	
	public void read(Book item) {
		item.open();
		System.out.println(this.name + " reads the book titled " + item.title);
	}

}
