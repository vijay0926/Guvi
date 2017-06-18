package prp;
import java.util.Scanner;
public class simple {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a =s.nextInt();	
        for(int i=1;i<=a;i++)
        {
        	int count=0;
        	for(int j=2;j<=i/2;j++)
        	{
        		if (i % j == 0) {
   		     count++;
   		     break;
   		    }
   		   }
   		  if(count==0&&i!=1)
   		        System.out.print(+i);
        }
	}	
	}
