import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

public static void main(String args[]) {

    try {
        final String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().toLowerCase().replaceAll(" ", "");

        char[] chars = str.toCharArray();
        final Set set = new HashSet();

        for(char c: chars){
            set.add(c);
        }

        System.out.println(set.size());
        if(set.size() == 26)
           System.out.println("pangram");
        else
            System.out.println("not pangram");

    } catch (Exception e) {
        e.printStackTrace();
    }

}
}
