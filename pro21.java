package prp;

import java.util.Scanner;

public class ArraySplit {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Number Of Element in the Array : ");
		int a=s.nextInt();
		int l=0;
		int[] arr=new int[a];
	   for(int i=0;i<a;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   s.close();
       for(int i=0;i<a;i++)
       {   
    	   int sum=0,sum1=0;
    	   for(int j=a-1;j>i;j--)
    	   {
    		 sum=sum+arr[j];  
    	   }
    	   for(int m=0;m<=i;m++)
    	   {
    		   sum1=sum1+arr[m];
    	   }
    	   if(sum1!=0&&sum!=0)
    	   {
    	   if((int)(sum1*(a-1-i))==(int)(sum*(i+1)))
    	   { 
    		  l++;
    		  System.out.println("Array1:");
    		  for(int k=0;k<=i;k++) 
    		  {
    			 System.out.println(+arr[k]+" "); 
    		  }
    		  System.out.println("Array2:");
    		  for(int k=i+1;k<a;k++) 
    		  {
    			 System.out.println(+arr[k]+" "); 
    		  }
    		  break;
    	   }
       }
       }
       if(l==0)
       {
    	   System.out.println("No Splitting Occurs.");     
       }
	}

}
