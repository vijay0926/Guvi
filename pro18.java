import java.util.Scanner;
public class Hello{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.next();
	int b=a.length();
int v=1;
	for(int i=0;i<a.length()-1;i++)
	{
		int n=0,m=0;
		 n=b/2;
		 m=n-1;
if(n>=2){
			System.out.println(b);
			System.out.println(n);
			System.out.println(m);
		String f=a.substring(0,m);
	String g=a.substring(a.length()-m);
	String h=f+g;
int j=h.length();
b=j;
	System.out.println(f +"  " + g);
}}}
}
