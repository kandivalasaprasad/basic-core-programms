package basicCoreProgramms;

import java.util.Scanner;

public class windChill {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println( "enter tempatature: " );
		double t =s.nextDouble();
		System.out.println( "enter wind speed : " );
		double v =s.nextDouble();
	    double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	       
	    	System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
	}
}
