package bcamp;
import java.util.*;
import java.math.*;


public class Cos {

	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an angle: ");
		double x= sc.nextDouble();
		
		x = Math.toRadians(x);
		System.out.println("\n angle conversion:  "+x);
		
		
		double si = 0 ;
		
		boolean plus =true;
		for(int i=1; i<=7; i=i+2) {
			double fact = factorial(i); 
			if(plus) {
				si = si + (Math.pow(x, i)/fact);
				plus= false;
			}
			else {
				si = si - (Math.pow(x, i)/fact);
				plus = true;
			}
		}
		System.out.println("Taylor series = " +si);
	}
}
