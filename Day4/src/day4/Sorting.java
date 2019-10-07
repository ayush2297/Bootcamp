package day4;

import java.util.*;

public class Sorting {
	
	public void bubble(int []arr,int n) {
		for(int i = 0 ; i<n;i++) {
			System.out.println("pass "+(i+1));
			for(int j =0 ; j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tem;
					tem = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void insertionsort(int []arr) {
		int key;
		
		for(int i=1;i<4;i++) {
			key = arr[i];
			int j=i-1;
			while (j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] =key;
		}
		for(int i=0; i <4;i++) {
			System.out.println(" "+arr[i]);
		}
	}
	
	public static void main(String []args) {
		int[] a = new int[] {2,5,1,7,3};
		System.out.println("output : ");
		Sorting s = new Sorting();
		//s.insertionsort(a);
		s.bubble(a, 5);
	}
}
