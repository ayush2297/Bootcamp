package bcamp;

import java.util.Scanner;

public class Primenofl {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound: ");
		int low = sc.nextInt();
		System.out.println("Enter upper bound: ");		
		int high = sc.nextInt();
		
		for(int i = low; i <= high; i++) {
			if(i==0 || i==1) {
				continue;
			}
			int k=i;
			boolean isPrime =true ;
			for(int j=2; j <=k/2; j++)
			{
				if(k%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				System.out.println(i+ " is a prime number");
			}
		}
	}
}
