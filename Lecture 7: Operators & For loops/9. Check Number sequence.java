import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
 		Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int val,temp=1000,inc=0,dec = 0;
        boolean t=true;
        while(n!=0)
        {
        	val = sc.nextInt();
        	if(val>temp && dec == 0)
        	{
        		inc = 1;
        		//t = true;
        		n--;
        	}
        	else if(val>temp && dec == 1)
        	{
        		inc = 1;
        		//t = false;
        		n--;
        	}
        	else if(val<temp && inc == 1)
        	{
        		dec = 1;
                t = false;
        		n--;
        	}
        	else if(temp>val && inc == 0)
        	{
        		dec = 1;
        		n--;
        	}
        	else if(temp == val)
        	{
        		t = false;//10.37 - 29
        		n--;
        	}
        	temp = val;
        }
        System.out.print(t);
        sc.close();
	}
}
 
