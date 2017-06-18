package prp;
import java.util.Scanner;
import java.util.Arrays;
public class simple {
public static void main(String[] args) {	
Scanner s=new Scanner(System.in);
System.out.println("Enter the dimension of array is:");
int n1=s.nextInt();
int n2=s.nextInt();
int arr[][]=new int[n1][n2];
int a[]=new int[n1*n2];
int k=0;
System.out.println("The input array is:");
for(int i=0;i<n1;i++)
{
	for(int j=0;j<n2;j++)
	{
		a[k]=Integer.parseInt(args[k]);
		arr[i][j]=Integer.parseInt(args[k]);
		System.out.print(+arr[i][j]+" ");
		k++;
	}
	System.out.println();
}
int temp=arr[0][2];
int temp1=arr[1][0];
arr[0][2]=arr[1][2];
arr[1][2]=temp;
arr[1][0]=arr[1][1];
arr[1][2]=temp1;
System.out.println("output matrix");
for(int i=0;i<n1;i++)
{
	for(int j=0;j<n2;j++)
	{
		System.out.print(+arr[i][j]+" ");
	}
	System.out.println();
}

}
}
