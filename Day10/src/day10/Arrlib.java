package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Arrlib<T> {

	static Scanner sc = new Scanner(System.in);
	public static void readIntArray(int rows, int columns) {
		Integer [][] a = new Integer [rows][columns];
		System.out.println("\nstart entering your array...:\n");
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		showArray(a);
	}
	
	public static void readDoubleArray(int rows, int columns) {
		Double [][] a = new Double[rows][columns];
		System.out.println("\nstart entering your array...:\n");
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		showArray(a);
	}
	
	public static  void readBooleanArray(int rows, int columns) {
		Boolean [][] a = new Boolean[rows][columns];
		System.out.println("\nstart entering your array...:\n");
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns; j++) {
				a[i][j] = sc.nextBoolean();
			}
		}
		showArray(a);
	}
	
	public static <T> void showArray(T [][]arr) {
		System.out.println("\nDisplaying your array...:\n");
//		for(int i=0; i<rows;i++) {
//			for(int j=0; j<columns; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		for(T[] element : arr) {
			System.out.print(Arrays.deepToString(arr));
		}
	}
}
