package day2;
import java.util.*;
import java.math.*;


public class Stats5 {
	public static void main(String [] args) {
		
		double sum,min,max,avg;	
		double n = Math.random();
		System.out.println(n+"\t");
		min = n;
		max = n;
		sum = n;
		
		for (int i=1;i<5;i++) {
			n = Math.random();
			System.out.println(n+"\t");
			if(n<min) {
				min = n;
			}
			if(n>max) {
				max = n;
			}
			sum =sum +n;
		}
		avg = sum/5;
		System.out.print("\nminimum: \t"+min);
		System.out.println("\nmaximum: \t"+max);
		System.out.println("average: \t"+avg);
	}
}
