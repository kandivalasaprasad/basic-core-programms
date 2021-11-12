package basicCoreProgramms;

import java.util.Scanner;

public class distance {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter x1 vaue");
		int x1 = s.nextInt();
		System.out.println("enter x2 vaue");
		int x2 = s.nextInt();
		System.out.println("enter y1 vaue");
		int y1 = s.nextInt();
		System.out.println("enter y2 vaue");
		int y2 = s.nextInt();
		
		int distance = (int) Math.pow((x2-x1)-(y2-y1), 2 );
		System.out.println( distance );

	}
}
