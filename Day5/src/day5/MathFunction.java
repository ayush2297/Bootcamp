package day5;
import java.util.*;
import java.math.*;
import java.math.*;

public class MathFunction {
	static void harmonic() {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the range of harmonic series: ");
		n = sc.nextInt();
		
		System.out.println("\nHARMONIC SERIES:::: \n");
		for(int i=1; i<=n; i++) {
			System.out.print("1/"+i);
			if(i!=n) {
				System.out.print(" + ");
			}
		}
	}
	
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
	}   
	
	static void sin(double x) {
		double y = Math.toRadians(x);
		System.out.println("\n angle conversion:  "+y);
		
		
		double si = 0 ;
		
		boolean plus =true;
		for(int i=1; i<=7; i=i+2) {
			double fact = factorial(i); 
			if(plus) {
				si = si + (Math.pow(y, i)/fact);
				plus= false;
			}
			else {
				si = si - (Math.pow(y, i)/fact);
				plus = true;
			}
		}
		System.out.println("\n sin of "+x+" using Taylor series = " +si);
	}
	
	static void cos(int x) {
		double y = Math.toRadians(x);
		System.out.println("\n angle conversion:  "+y);
		
		
		double si = 1 ;
		
		boolean plus =false;
		for(int i=2; i<=8; i=i+2) {
			double fact = factorial(i); 
			if(plus) {
				si = si + (Math.pow(y, i)/fact);
				plus= false;
			}
			else {
				si = si - (Math.pow(y, i)/fact);
				plus = true;
			}
		}
		System.out.println("\n cosine of "+x+" using Taylor series = " +si);
	}
	
	static void binary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i=0;
		int array[] = new int[15] ;
		while(n!=0) {
			int a = n%2;
			array[i] = a;
			n = n/2;
			i++;
		}
		for(int j = 7 ; j>=0 ; j--) {
			System.out.print(array[j]);
			if(j==4) {
				System.out.print("  ");
			}
		}
	}
	
	static double sqrt(double x) {
		double t= x;
		double eps = 1e-15;
		double epst = eps*t;
		
		do {
			t =((x/t)+t)/2;
		}while(Math.abs(t-(x/t))>epst);
		
		return t;
	}
	
	public void isPrime(int n) {
		boolean isP = true;
		if(n==0 || n==1) {
			isP =false;
		}
		else {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					isP=false;
					break;
				}
			}
		}
		if(isP) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
	
	public static long factor(int n) {
		long fact=1;
		for(int i =1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void futureValue() {
		Scanner sc = new Scanner(System.in);
		float c, r, n, t;
		System.out.println("Enter the amount invested: ");
		c = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		r = sc.nextInt();
		//System.out.println("Compounded how many times a year? ");
		//n = sc.nextInt();
		System.out.println("Enter the time period: ");
		t = sc.nextInt();
		float nr = 1+r;
		double s = Math.pow(nr, t);
		double compound = c*s;
		System.out.println("Future value is: " +compound);
	}
	
	public static void main(String []args) {
		MathFunction m = new MathFunction();
		//harmonic();
		//sin(30);
		//cos(60);
		//binary();
		//double ans = sqrt(16);
		//System.out.println("square root is : "+ans );
		//m.isPrime(4);
		//long ans1 = factor(3);
		//System.out.println("factor is : "+ans1 );
		futureValue();
	}
}
