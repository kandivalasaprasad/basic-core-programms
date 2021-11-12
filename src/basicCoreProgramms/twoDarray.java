package basicCoreProgramms;

import java.util.Scanner;

public class twoDarray {
	public static void main(String[] args) {
        
	       System.out.print("Enter 2D array size : ");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter number of rows in array  : ");
	       int rows=sc.nextInt();
	       System.out.println("Enter number of columns in array  : ");
	       int columns=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int twoD[][]=new int[rows][columns];
	        
	          
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                System.out.println( "enter "+ i +j+" element ");

	            	twoD[i][j]=sc.nextInt();
	            }
	         }
	        System.out.print("\nData you entered : \n");
	        for(int i=0; i<rows ;i++){
	            for(int j = 0; j<columns ; j++) {
	            	
	            	System.out.print(twoD[i][j] + "  ");
	            	
	            }
	        	System.out.println();
	            
	            }
	        
	    }  
}



