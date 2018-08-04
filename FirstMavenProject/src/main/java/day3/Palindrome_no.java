package day3;

public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		int temp;
		int n=545,sum = 0;
		
		temp=n;
		while(n>0) {
			
			r=n%10;
			
			sum = (sum*10) + r;
			n = n/10;
		}
		if(temp==sum) {
		
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome number");
			
		}
		
		

	}

}
