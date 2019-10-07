package day2;
import java.util.*;
import java.math.*;

public class Trig {

	public static void main(String [] args) {
		System.out.println("Enter an angle: ");
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble();
		double radians = Math.toRadians(angle);
		System.out.println("Angle in radians: "+ Math.toRadians(radians));
		System.out.println("Sin(" +angle+") = "+Math.sin(radians));
		System.out.println("cos("+angle+") = "+Math.cos(radians));
	}
	
}
