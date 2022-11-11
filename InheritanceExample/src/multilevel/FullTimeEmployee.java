package multilevel;

public class FullTimeEmployee extends Employee {
	
	int id;
	String dept;
	
	public FullTimeEmployee(String name, String email, int sal, String qualification, int id, String dept) {
		super(name, email, sal, qualification);
		this.id = id;
		this.dept = dept;
	}
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Full Time Employee Display:"+id+" Dept:"+dept);
	}
	
	

}
