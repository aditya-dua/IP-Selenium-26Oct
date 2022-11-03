
public class ElseIfMain {

	public static void main(String[] args) {
		
		int a = -1, b= 80, c= 90, d= 70, e= 67;
		
		
		int sum = a+b+c+d+e;
		int avg = sum/5;
		
		if(avg>=90) {
			System.out.println("Execllent");
		}else if(avg >= 70 && avg < 90) {
			System.out.println("Good");
		}else if(avg >= 50 && avg < 70) {
			System.out.println("OK");
		}else if(avg > 0 && avg < 50) {
			System.out.println("Fail");
		}else {
			System.out.println("Not a Valid input!");
		}
	}
}
