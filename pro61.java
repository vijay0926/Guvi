package program;

import java.util.Scanner;

public class encoding {

	public static void main(String[] args) {
		 System.out.println("Ente the Number : ");
		    Scanner s=new Scanner(System.in);
		    String str=s.next();
		    char[] c=new char[str.length()];
		    String str1=s.next();
		    char[] c1=new char[str.length()-2];
		    s.close();
		   
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>='a'&&str.charAt(i)<='z'-10)
				{
				 c[i]=(char) (str.charAt(i)+10);
				}
				else
				{
					int n='z'-(str.charAt(i));
					c[i]=(char) ('a'+10-n);
				}
			}
			System.out.print(c);
			
			for(int i=0;i<str1.length()-2;i++)
			{
				if(str1.charAt(i+1)>='a'&&str1.charAt(i+1)<='z'-10)
				{
				 c1[i]=(char) (str1.charAt(i+1)+10);
				}
				else
				{
					int n='z'-(str1.charAt(i+1));
					c1[i]=(char) ('a'+9-n);
				}
			}System.out.print(" "+str1.charAt(0));
			System.out.print(c1);
			System.out.print(str1.charAt(str1.length()-1));
	}
}
