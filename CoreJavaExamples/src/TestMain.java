import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			readFromFile();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test");

	}
	public static void readFromFile() throws Exception {
		File f = new File ("abc.txt");
		int a = 5;
		try {

			if(a<10) {
				throw new Exception("Incorrect value of a");
			}
		} finally {
			System.out.println("In Finally");
		}	
	}

}

