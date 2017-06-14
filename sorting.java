package javaprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=0,g=0;
	    System.out.print("Enter the Number of array elements : ");
        int a=s.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<a;i++)
        {
        	arr[i]=s.nextInt();	
        }
        Arrays.sort(arr,0,arr.length);
        System.out.println("Output : ");
        for(int i=a-1;i>=0;i--)
        {
        	System.out.println(+arr[i]);
        }
        s.close();
	}

}
