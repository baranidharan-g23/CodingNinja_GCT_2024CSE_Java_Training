import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char st = 'A';
        for(int i = 1;i<n;i++)
        	st++;
        char str;
        for(int i = 0;i<n;i++)
        {
        	str=st;
        	for(int j = 0;j<=i;j++)
        	{
        		System.out.print(str);
        		str++;
        	}
        		st--;
        		System.out.println("");
        }
	  }
}
