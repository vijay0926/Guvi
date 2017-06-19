package polymorphism;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String str=s.next();
	    int l=str.length();
		String arr[]=new String[100];
		s.close();
		int k=0;
	   for(int i=0;i<=l;i++)
	    {
	    	for(int j=i+1;j<=l;j++)
	    	{
	    		StringBuffer str1 = new StringBuffer(str);
	            str1.reverse();
	    		if(str.substring(i,j).equals(str1.substring(i,j)))
	    		{
	    			arr[k]=str.substring(i,j);
	    			k++;
	    		}
	    	}
	    }
  
	   String greatest=arr[0]; 
	    for(int i=0;i<k;i++)
	    {  
	    	if(arr[i].length()>greatest.length())
	    	{
	    	greatest=arr[i];
	    	}
	    }
	    
	    System.out.println(greatest);
	}

}
