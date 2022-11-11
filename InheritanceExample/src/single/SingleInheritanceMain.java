package single;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("ABC", "abc@abc.com");
		p.display();
		p.test();
		
		Student s = new Student("Student - 1", "s@student.com", 1, "Java");
		s.display();
		s.test();

	}

}
