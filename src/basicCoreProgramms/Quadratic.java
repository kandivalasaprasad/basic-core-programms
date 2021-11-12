package basicCoreProgramms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println( "enter value of a: " );
		int a = s.nextInt();
		System.out.println( "enter value of b: " );
		int b = s.nextInt();
		System.out.println( "enter value of c: " );
		int c = s.nextInt();
	//	System.out.println( "enter value of x: " );
	//	int x = s.nextInt();
	
		int delta = b*b - 4*a*c;
		System.out.println( "value of delta is: " +delta);
		//int eqn = (a*x*x + b*x + c);
	//	System.out.println( "equation is " +eqn );
		int roo1 = (int) ((-b + Math.sqrt(delta))/(2*a));
		int roo2 = (int) ((-b - Math.sqrt(delta))/(2*a));
		System.out.println( roo1 + "  " + roo2 );

	}
}
