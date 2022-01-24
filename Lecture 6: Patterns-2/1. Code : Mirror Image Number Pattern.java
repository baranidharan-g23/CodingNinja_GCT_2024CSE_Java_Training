import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j=0,k=0;
        for(int i =1;i<=a;i++)
        {
        	for(k=a;k>i;k--)
        		System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println(" ");
        }
        sc.close();	
	}
}
