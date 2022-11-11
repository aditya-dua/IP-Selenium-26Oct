package single;

public class Student extends Person{

	int id;
	String course;
	
	public Student(String name, String email, int id, String course) {
		super(name, email);
		this.id = id;
		this.course = course;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Student: ID -"+this.id+" course:"+this.course);
	}
	
	
	
	
}
