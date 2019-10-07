package day2;
import java.util.*;

public class HarmonicNumber {

	public static void main(String []args) {
		double n = Double.parseDouble(args[0]);
		double h = 0;
		for(int i=1; i<=n; i++) {
			h = h+(1/i);
		}
		System.out.println(h);
	}
	
}
