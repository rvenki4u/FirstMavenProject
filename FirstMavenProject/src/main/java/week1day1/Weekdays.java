package week1day1;

import java.util.Scanner;

public class Weekdays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the no between 1 to 7 ");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt(); 

		switch(number) {

		case 1:

			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
		case 3:

			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;


		case 5:
			System.out.println("Friday");
			break;
		case 6:

			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Enter numer between 1-7");
		}

	}

}
