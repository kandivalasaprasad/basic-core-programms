package basicCoreProgramms;

import java.util.Scanner;
public class oddEven {
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println(" enter number :  ");
		int a = s.nextInt();
		
		if(a%2 == 0)
			System.out.println(" even number ");
		else
			System.out.println(" odd number ");

		
	
	
	}
	
}