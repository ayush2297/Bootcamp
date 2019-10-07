package day2;
import java.util.*;
import java.math.*;

public class TempConv {
	public static void main(String [] args) {
		
		int ch;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n\nEnter a choice:\n1.deg.celc. to farh.\n2.fahr. to deg.celc.\n3.EXIT\n");
			ch = sc.nextInt();
			switch(ch){
				case 1: 
					System.out.println("enter temperature in degree celsius: ");
					int deg = sc.nextInt();
					int f = (deg*9/5)+32;
					System.out.println("\nTemperature in Fahrenheit: "+f);
					break;
				case 2:
					System.out.println("enter temperature in Fahrenheit: ");
					int fah = sc.nextInt();
					int c = (fah-32)*5/9;
					System.out.println("\nTemperature in Degree Celsius: "+c);
					break;
				case 3:
					break;
				default:
					System.out.println("\nWrong input ..... please try again\n");	
			}
		}while(ch!=3);
	}
}
