package codingchallenge;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {22,23,45,67,78};
		int b =0;

		for(int i=0;i<a.length;i=i+1) {
			
			 b += a[i];
			
		}
		
		System.out.println("The Sum of array is"+b);
	}

}
