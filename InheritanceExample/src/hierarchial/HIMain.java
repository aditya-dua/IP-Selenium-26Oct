package hierarchial;

import single.Person;
import single.Student;

public class HIMain {
	
	public static void main(String[] args) {
		
		Person p = new Person("ABC", "abc@abc.com");
		p.display();
		
		Student s = new Student("Student - 1", "s@student.com", 1, "Java");
		s.display();
		
		Trainer t = new Trainer("Trainer - 1", "t@trainer.com", 100, "qual");
		t.display();
	}

}
