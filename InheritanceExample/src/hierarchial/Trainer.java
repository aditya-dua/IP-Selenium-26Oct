package hierarchial;

public class Trainer extends Person {

	int sal;
	String qualification;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(String name, String email, int sal, String qualification) {
		super(name, email);
		this.sal = sal;
		this.qualification = qualification;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Trainer Class: Sal - "+sal+" Qual:"+qualification);
		
	}
}
