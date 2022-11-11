package hierarchial;

public class Person {
	
	String name;
	String email;
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Person: Name - "+this.name+" Email: "+this.email);
	}
	

}
