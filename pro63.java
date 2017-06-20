package pr;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class duplicate {
	    void removeDuplicates(String str)
	    {
	        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	        for(int i=0;i<str.length();i++)
	            lhs.add(str.charAt(i));
	        int k=0;
	        for(Character ch : lhs)
	        {
	            System.out.print(ch);
	            k++;
	        }
	        System.out.println(); 
	        System.out.println(k);
	    }
	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		   String str = s.nextLine();
		   s.close();
	       duplicate r = new duplicate();
	       r.removeDuplicates(str);
	}

}
