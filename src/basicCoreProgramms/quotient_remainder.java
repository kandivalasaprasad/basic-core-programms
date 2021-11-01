package basicCoreProgramms;

import java.util.Scanner;

public class quotient_remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the value:  ");
		int value = s.nextInt();
		System.out.println(" enter the number divisior ");
		int divisior = s.nextInt();
		
		int quotient = value/divisior;
		int remainder = value%divisior;
		System.out.println(" quotient is:  " + quotient);
		System.out.println(" remainder is: " + remainder);


		

	}

}
