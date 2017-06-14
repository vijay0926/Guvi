package javaprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int b=0;
	    System.out.print("Enter the Number : ");
        int a=s.nextInt();
        int c=a;
        while(a!=0)
        {
        	b=a%10;
        	c=c*b;
        	a=a/10;
        }
        System.out.print("Output : "+c);
        s.close();
	}

}
