package javaprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the Number : ");
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
        	 arr[i]=s.nextInt();
        }
      
        System.out.print("Output : "+(arr[0]+arr[1]));
        s.close();
	}

}
