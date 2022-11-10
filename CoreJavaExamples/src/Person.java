
public class Person {
	
	String name;
	int id;
	String phoneNumber;
	int age;
	
	public Person(String name, int id, String phoneNumber, int age) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}
	
	
	
	
	
	
	

}
