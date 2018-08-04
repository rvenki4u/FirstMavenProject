package codingchallenge;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter the two 'm' and 'n' value for multiplication table--->");
		
		m = s.nextInt();
		n = s.nextInt();
		
		for(int j=1;j<=n;j++) {
			
			System.out.println(j+"x"+m +"="+(j * m));
	
		}

	}
}
