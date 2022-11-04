
public class SumOfNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2,start = 7, sum =0,count=0;
		
		if(start%2==0) {
			start++;
		}else {
			
		}
		for(int i = start;count<n;count++,i=i+2) {
			sum = sum+i;
		}
		
		System.out.println(sum);
	}

}
