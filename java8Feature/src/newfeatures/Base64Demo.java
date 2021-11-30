package newfeatures;

import java.util.Base64;
import java.util.Scanner;

// Java program to Encrypt and Decrypt data 
public class Base64Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String userName,password;
		 System.out.println("*****Welcome To Coforge Technologies*****");
		 System.out.println("Enter your User Name: ");
		 userName = s.next();
		 
		 System.out.println("Enter your Password: ");
		 password = s.next();
		 
//		 Encoding the byte String to the Base64 format
		 String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
		 
		 System.out.println("Login Successful  !!! ");
		 System.out.println("User Name: "+ userName);
		 System.out.println("Password: "+ encodedPassword);
		 
		 System.out.println("*******Decrypt the Password********");
		 
//		 decode Base64 format to String
		 String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword));
		 System.out.println("The Password is: "+ decodedPassword);
	
		 System.out.println("******* URL Encoding *******");
		 Base64.Encoder encoder = Base64.getUrlEncoder() ;
		 String eURL = encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		 System.out.println("Encoded URL: "+ eURL);
		 
		 System.out.println("******* URL Decoding ********");
		 Base64.Decoder decoder = Base64.getUrlDecoder();
		 String dURL = new String(Base64.getDecoder().decode(eURL));
		 System.out.println("Decoded URL: "+ dURL);
	}

}
