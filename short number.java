package javaprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=0,g=0;
	    System.out.print("Enter the Number : ");
        int a=s.nextInt();
        int c=a;
        while(c!=0)
        {
        	c=c/10;
        	g++;
        }
        int[] arr=new int[g];
        while(a!=0)
        {
        	arr[k]=a%10;
        	a=a/10;
        	k++;
        }
        Arrays.sort(arr,0,arr.length);
        System.out.print("Output : ");
        System.out.println(+(arr[0]*10+arr[1]));
        s.close();
	}

}
