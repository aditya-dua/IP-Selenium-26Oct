import java.util.ArrayList;

public class CustomClassCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> personAL = new ArrayList<>();
		
		Person p = new Person("Aditya", 1, "1234567890", 30);
		
		personAL.add(p);
		
		Person p1 = new Person();
		
		personAL.add(p1);
		
		System.out.println("Size:"+personAL.size());
		
		System.out.println(personAL);

	}

}
