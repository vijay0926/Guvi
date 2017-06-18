package prp;
import java.util.Scanner;
public class bitSplit {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter k value : ");
		int k=s.nextInt();
		s.close();
		for(int i=0;i<Math.pow(2, k)-1;i++)
		{
		System.out.println(Integer.toBinaryString(i));	
		}
	}
}
