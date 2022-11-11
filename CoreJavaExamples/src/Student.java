
public class Student {
	
	int id;
	String name;
	String email;
	private String password;
	
	public Student() {
		System.out.println("In Student Constructor");
	}
	
	public Student(int id, String name) {
		//id=id;
		this.id= id;
		this.name=name;
	}

}
