package prp;
import java.util.Scanner;
public class problem {
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);   
		 System.out.println("Enter the String");
	     String str1=s.next();
	    String str2=str1.substring(0,1);
	     int result = str1.compareTo(str2);
	     System.out.print("output : ");
	     System.out.println(result);
	}
}
