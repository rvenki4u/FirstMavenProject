package codingchallenge;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the month in no");
		int m = s.nextInt();
		
		switch(m) {
		
		case 1:{
			System.out.println("Hi I am January");
			System.out.println("Have 31 days");
		    break;
		}
		case 2:{
			System.out.println("Hi I am Febrauary");
			System.out.println("Have 28 days");
		    break;
		}
		case 3:{
			System.out.println("Hi I am March");
			System.out.println("Have 31 days");
		    break;
		}
		case 4:{
			System.out.println("Hi I am April");
			System.out.println("Have 30 days");
		    break;
		}
		case 5:{
			System.out.println("Hi I am May");
			System.out.println("Have 31 days");
		    break;
		}
		case 6:{
			System.out.println("Hi I am June");
			System.out.println("Have 30 days");
		    break;
		}
		case 7:{
			System.out.println("Hi I am July");
			System.out.println("Have 31 days");
		    break;
		}
		case 8:{
			System.out.println("Hi I am August");
			System.out.println("Have 31 days");
		    break;
		}
		case 9:{
			System.out.println("Hi I am September");
			System.out.println("Have 30 days");
		    break;
		}
		case 10:{
			System.out.println("Hi I am October");
			System.out.println("Have 31 days");
		    break;
		}
		case 11:{
			System.out.println("Hi I am November");
			System.out.println("Have 30 days");
		    break;
		}
		case 12:{
			System.out.println("Hi I am December");
			System.out.println("Have 31 days");
		    break;
		}
		default:
			System.out.println("Enter a valid month number");
	}

}
	}
