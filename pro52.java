package project;
import static java.lang.Math.*;
import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int[] arr=new int[4];
		int[] arr1=new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i]=s.nextInt();
			arr1[i]=s.nextInt();
		}
		
	     if((arr[0]==arr1[3])&&(arr[1]==arr1[0])&&(arr[2]==arr1[1])&&(arr[3]==arr1[2]))
	     {
	    	 System.out.println("square");
	     }
	     else
	     {
	    	 System.out.println("not square");
		}
	}
}
