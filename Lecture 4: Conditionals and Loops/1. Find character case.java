
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char b =st.charAt(0);
        int a = (int)b;
        if(a>=97&&a<=123)//using ascii values of alphabets
        	System.out.println(0);
        else if(a>=65&&a<=91)
            System.out.println(1);
        else
            System.out.println(-1);

    }
}
