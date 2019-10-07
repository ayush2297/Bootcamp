package bcamp;
import java.util.*;

public class Primeno {
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
			else if(i==2) {
				System.out.println(i+" is a prime number \n");
			}
			else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%9!=0 && i%11!=0) {
				System.out.println(i+ " is a prime number");
			}
		}
	}
}
