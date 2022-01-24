import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
        double sa = sc.nextDouble();
        String gd = sc.next();
        char grade = gd.charAt(0);
        double hra,da,allow,pf;
        hra = (sa/100)*20;
		    da = (sa/100)*50;
        if(grade == 'A')
            allow = 1700;
        else if(grade == 'B')
            allow = 1500;
        else
        {
            allow = 1300;
        }   
        pf = (sa/100)*11;
        double tsa = (sa+hra+da+allow-pf);
        System.out.println(Math.round(tsa));
	}
}
