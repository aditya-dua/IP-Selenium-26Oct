import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alList = new ArrayList<>();
		
		alList.add("Aditya");
		alList.add("David");
		alList.add("John");
		
		System.out.println("Arraylist Size:"+alList.size());
		
		System.out.println("Arraylist element at 3:"+alList.get(2));
		
		System.out.println("Arraylist remove at 0:"+alList.remove(0));

		System.out.println("Arraylist Size:"+alList.size());

		alList.add(1,"ABC");
		
		System.out.println("Arraylist Size:"+alList.size());
		
		for (int i = 0; i < alList.size(); i++) {
			System.out.print(alList.get(i));
		}
		
		System.out.println();

		Collections.sort(alList);
		
		for (int i = 0; i < alList.size(); i++) {
			System.out.print(alList.get(i));
		}
		
		/*for (Iterator iterator = alList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}*/

		
	}

}
