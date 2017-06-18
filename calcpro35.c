package prp;
import java.util.Scanner;
public class problem {
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);   
		 System.out.println("Enter the String");
	     int a=s.nextInt();
	     for(int i=0;i<a;i++)
	     {
	    	 for(int j=0;j<a;j++)
		     {
	    		 if(i==0||j==0||i==(a-1)||j==(a-1))
	    		 {
	    		 System.out.print("*");
	    		 }
	    		 else
	    		 {
	    			 System.out.print(" ");
	    		 }
		     }
	    	 System.out.println();
	     }   
	}
}
