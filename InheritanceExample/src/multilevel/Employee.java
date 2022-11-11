package multilevel;

public class Employee extends Person {

	int sal;
	String qualification;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, int sal, String qualification) {
		super(name, email);
		this.sal = sal;
		this.qualification = qualification;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Employee Class: Sal - "+sal+" Qual:"+qualification);
		
	}
}
