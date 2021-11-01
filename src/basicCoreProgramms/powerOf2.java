package basicCoreProgramms;

import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the power Value N:  ");

		int N = s.nextInt();
		int value = 1;
		if(N<32) {
		for(int i=0; i<N; i++) {
			int power=(int) Math.pow(2, i);
			
			System.out.print("2^" +i + " = ");
			//System.out.println(i +  " is: ");
			System.out.println(power);
			}
		}
		else if (N>32)
			System.out.println(" N not exceed 32 ");
//	System.out.println(N);

	}

}
