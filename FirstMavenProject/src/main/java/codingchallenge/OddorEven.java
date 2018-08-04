package codingchallenge;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter the number--->");
		
		int n = s.nextInt();
		
		if(n%2 == 0) {
			
			System.out.println("This is EVEN number");
		} else {
			
			System.out.println("This is ODD number");
		}

	}

}
