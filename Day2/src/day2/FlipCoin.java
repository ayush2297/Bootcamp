package day2;
import java.util.*;
import java.math.*;

public class FlipCoin {

	public static void main(String [] args) {
		System.out.println("\nPress ENTER to flip a coin....");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int ch;
		do {
			double flip = Math.random();
			if(flip<0.5) {
				System.out.println("Heads....\n");
			}
			else {
				System.out.println("Tails....\n");
			}
			System.out.println("\nTo flip again press 1\nTo exit press any other number.....");
			ch = sc.nextInt();
		}while(ch==1);
	}
	
}
