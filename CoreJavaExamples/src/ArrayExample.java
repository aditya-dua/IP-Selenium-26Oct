
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[] = new int[5];
		int sum = 0;
		//int i;
		marks[0]= 90;
		marks[1]= 70;
		marks[2]= 80;
		marks[3]= 60;
		marks[4]= 70;
		
		
		for(int x =0;x<marks.length;x++) {
			//i=marks[x];
			//System.out.println("Marks:: "+marks[i]);
		}
		
		
		for (int i : marks) {
			sum = sum+i;
		}
		
		
		System.out.println(sum);
		
	}

}
