import java.util.HashSet;

public class HashSetExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List of Country
		HashSet<String> nameHS = new HashSet<>();
		
		System.out.println("Size"+nameHS.size());
		
		nameHS.add("Aditya");
		nameHS.add("John");
		//nameHS.add("David");
		nameHS.add("Ben");
		
		System.out.println("Size"+nameHS.size());
		nameHS.add("David2");
		
		if(nameHS.add("David")) {
			System.out.println("David Add Sucess");
		}else {
			System.out.println("David Add Failure");
		}
		if(nameHS.add("David")) {
			System.out.println("David Add Sucess");
		}else {
			System.out.println("David Add Failure");
		}

		System.out.println("Size"+nameHS.size());


		System.out.println(nameHS);


	}

}
