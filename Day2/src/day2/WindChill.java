package day2;
import java.util.*;
import java.math.*;


public class WindChill {

	public static void main(String []args) {
		
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if(t>Math.abs(50.0000)) {
			System.out.println("invalid input 1");
			return;
		}
		if(v>120 || v<3) {
			System.out.println("invalid input 2");
			return;
		}
		System.out.println(""+t);
		System.out.println(""+v);
		
		double w = 35.4 +(0.6215*t - 35.75) * Math.pow(v, 0.16);		
		System.out.println("Temperature is: "+w);
	}
}
