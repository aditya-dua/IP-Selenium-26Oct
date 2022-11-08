
public class StringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Aditya";
		
		String uName = "Aditya";
		
		String nameObject = new String("Aditya");
		
		if(name == uName) {
			System.out.println(" name and uname are same object");
		}else {
			System.out.println(" name and uname are different object");
		}
		
		
		if(name == nameObject) {
			System.out.println(" name and nameObject are same object");
		}else {
			System.out.println(" name and nameObject are different object");
		}

		if(name.equals(nameObject)) {
			System.out.println(" name and nameObject are same having same values");

		}else {
			System.out.println("name and nameObject are same having different values");
		}
	}

}
