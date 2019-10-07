package day9;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;  

public class RegExp {

	public static void main(String [] args) {
		String template = "\nHello NAME, we have your full name as "
				+ "FULLNAME in our system.\nYour contact number is 91-xxxxxxxxxx"
				+ "\nPlease, let us know in case of any clarification."
				+ "\nThank you  \nBridgeLabz \t XX/XX/XXXX";
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);
	    
	    template = template.replaceAll("X{2}/X{2}/X{4}", strDate);
	    System.out.println(template);
		
	}
	
}
