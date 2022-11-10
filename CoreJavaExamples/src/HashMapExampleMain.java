import java.util.HashMap;

public class HashMapExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> peopleHM = new HashMap<>();
		
		peopleHM.put("John", "123, Street - 1, US");
		peopleHM.put("David", "456, Street - 1, US");
		
		peopleHM.put("John", "789, Street - 1, US");
		
		
		System.out.println("Size of HM is:"+peopleHM.size());
		
		if(peopleHM.containsKey("John")) {
			System.out.println("The Key is :"+"John and the value is:"+peopleHM.get("John"));
		}
		
		
		System.out.println(peopleHM);
		

	}

}
