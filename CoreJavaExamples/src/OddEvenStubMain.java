
public class OddEvenStubMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		System.out.println(num+" is a "+checkIfOddOrEven(num)+" number.");
	}
	
	public static String checkIfOddOrEven(int num) {
		if(num%2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	
	// A function can only be called with a object
	// Static : Static which means class level.
	// Any thing which is static can be accessed directly with the classname
	

}
