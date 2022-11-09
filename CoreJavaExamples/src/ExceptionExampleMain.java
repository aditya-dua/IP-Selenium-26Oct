
public class ExceptionExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Try");
		try {
			System.out.println("Try :: START");

			int a = 100;
			int c = a/10;
			
			int arr[] = new int[10];
			
			System.out.println("arr[10]"+arr[10]);
		
			System.out.println("Try :: END");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("In ArithmeticException Block");
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("In Exception Block");
			e.printStackTrace();
		}
		
		
		System.out.println("Outside Try Catch");

	}

}
