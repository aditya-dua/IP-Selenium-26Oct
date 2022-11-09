import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			readFromFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test");
		
		

	}
	
	public static void readFromFile() throws FileNotFoundException  {
		
		File f = new File("abc.txt");
		
		try {
			FileInputStream fStream = new FileInputStream(f);
		} finally {
			System.out.println("In Finally");
		}
	}

}
