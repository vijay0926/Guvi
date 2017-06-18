package project;
import static java.lang.Math.*;
import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=s.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<a;i++)
		{
		 System.out.println(+min(arr[i]%10,arr[i]/10));
		}
	}
}
