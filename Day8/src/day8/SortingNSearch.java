package day8;
import java.util.*;
import java.io.*;

public class SortingNSearch {

	public static void BinSearch(String s) throws FileNotFoundException {
		File file = new File("/home/admin1/day8.txt");		//file input
		Scanner sc = new Scanner(file);						//scanner to read the file
		int count = 0;
		String b,c = "";
		while(sc.hasNextLine()) {
			b = sc.nextLine();								//take next line
			c = c+b;										//store/append next line
		}
		System.out.println(c+ " ");
		
		count++;
		System.out.print(count);
		
		//sc.useDelimiter("\\Z");
		//String b = sc.next();
		System.out.println("\nwith spl.chars\n"+c);			//file elements	
		c = c.replaceAll("[^a-zA-Z0-9\\s\\n]", "");			//removing all spl characters
		System.out.println("\nw/o spl.chars\n"+c);			
		String arr = "";									
		String[] a = c.split(" "); 							//putting string w/o spl chars to string array \
															//splitting on the " " or WHITE_SPACE
		for(String str : a) {
			str = str.toLowerCase();						//changing whole string to lowercase
			arr = arr+" "+str;								//storing/appending lowercase words to new string 
		}

		a = arr.split(" ");
		Arrays.sort(a);										//sorting the elements in asc order
		
		System.out.println("\nAFTER SORTING\n");
		for(String str : a) {								//for every string in the string array a print it
			System.out.print(str+" ");
		}

/*		ArrayList<String> al = new ArrayList<String>();
//		String[] op = new String[a.length];
//		op[0] = a[0];
		int k =1;
		for(int i = 1; i<a.length; i++) {
			if(a[i].equalsIgnoreCase(a[i+1])) {
				continue;
			}
			al.add(a[i]);
		}
		String op[] = new String[al.size()]; 
		  
        // Convert ArrayList to object array 
        Object[] objArr = al.toArray(); 
  
        // Iterating and converting to String 
        int i = 0; 
        for (Object obj : objArr) { 
            op[i++] = (String)obj; 
        } 
  
		System.out.println("\nAFTER Removing duplicates\n");
		for(String str : op) {								//for every string in the string array a print it
			if(str==null) {
				break;
			}
			System.out.print(str+" ");
		}
*/		
		boolean present = false;							//present is a flag for search operation
		int lo=0,hi=a.length-1;
		int mid = (lo+hi)/2;
		while(lo<=hi || a[mid]!=null) {
			int comp = s.compareTo(a[mid]);					//unicode comparison of strings
			if(comp<0) {									//if s < a[mid]
				hi = mid - 1;
				mid = (lo + hi)/2;
			}
			else if(comp > 0) {								//if s > a[mid]
				lo = mid + 1;
				mid = (lo + hi)/2;
			}
			else {
				present = true;								//if s = a[mid]	
				break;
			}
		}
		if(present) {
			System.out.println("\nWord found....\n");;
		}
		else {
			System.out.println("\nWord not found......\n");
		}
	}
	
	public static void main(String [] args) throws FileNotFoundException {

		SortingNSearch obj = new SortingNSearch();
		Scanner sc = new Scanner(System.in);
		String word = sc.next();;
		BinSearch(word);
		
	}
}
