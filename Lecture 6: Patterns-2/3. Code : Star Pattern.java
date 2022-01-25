import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
    {	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        for(int i = 0;i<a;i++)
        {
        	for(int k=(i+1);k<a;k++)
        		System.out.print(" ");
        	for(int j=0;j<=i;j++)
    			System.out.print("*");
        	for(int k=1;k<=i;k++)
        		System.out.print("*");
        	System.out.print("\n");
        }
		sc.close();		
	}
}
