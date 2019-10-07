package bcamp;
import java.util.*;
import java.math.*;
public class Binary {
	public static void main(String [] args) {
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
			System.out.println(array[j]);
			if(j==4) {
				System.out.println("\n");
			}
		}
		System.out.println("\nAfter swapping\n");
		
		for(int j = 0 ; j<=7 ; j++) {
			System.out.println(array[j]);
			if(j==3) {
				System.out.println("\n");
			}
		}
		double sum =0;
		int l =7 ;
		for(int k = 0; k<=7;k++) {
			sum = sum + array[k] * Math.pow(2.00, (double)l);
			l--;
		}
		System.out.println("\nnumber is "+sum);
	}
}