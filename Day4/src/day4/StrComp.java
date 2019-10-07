package day4;

import java.util.*;
import java.util.Arrays;

public class StrComp {
	
	public void anagram(String s1, String s2) {
		
		boolean ana = true;
		
		char [] a = new char[10];
		char [] b = new char[10];
		
		a = s1.toCharArray();
		b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(s1.length()== s2.length()) {
			if(s1.equals(s2)) {
				System.out.println("same words");
			}
			else {
				for(int i =0 ;i<s1.length(); i++) {
					if(a[i]!=b[i]) {
						ana = false;
						break;
					}
				}
			}
		}
		
		if(ana) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
	}
	
	public void palind(String s) {
		
		boolean p = true;
		
		int l = 0;
		int h = s.length()-1;
		
		char [] a = s.toCharArray();
		
		while (h>l) {
			if(a[l++]!=a[h--]) {
				p = false; 
				break;
			}
		}
		
		if (p) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
	
	public void comp(String s1, String s2) {
		
		boolean equal = true;
		
		char [] a = new char[10];
		char [] b = new char[10];
		
		a = s1.toCharArray();
		b = s2.toCharArray();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				if(a[i]!=b[i]) {
					equal = false;
					break;
				}
			}
			if(equal) {
				System.out.println("Strings equal");
			}
			else {
				System.out.println("Not equal");
			}
		}
	
	}
	
	public static void main(String [] args) {
		String a = "code";
		String b = "doce";
		String c = "reviver";
		
		StrComp s = new StrComp();
		//s.comp(a, b);
		//s.palind(c);
		s.anagram(a, b);
	}
	
}
