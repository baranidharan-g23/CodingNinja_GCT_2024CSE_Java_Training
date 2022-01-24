import java.util.Scanner;
public class Solution 
{ 
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
   	 	int a = sc.nextInt();
    	int n = sc.nextInt();
    	int tot=1;
    	for(int i=0;i<n;i++)
    	    tot*=a;
   	 	System.out.println(tot);
    }
}
