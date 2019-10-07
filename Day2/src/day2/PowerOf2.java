package day2;
import java.util.*;
import java.math.*;

public class PowerOf2 {
	
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=0;i<n;i++){
			double trt = Math.pow(2, i);
			System.out.println("2 raised to "+(i+1)+ " = "+trt);
		}
	
	}
	
}
