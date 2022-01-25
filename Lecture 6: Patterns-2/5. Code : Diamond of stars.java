import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for(int i =0;i<n/2+1;i++)
        {
            for(int j=i;j<n/2;j++)
            	System.out.print(" ");
            for(int k=n;k>=temp;k--)
            	System.out.print("*");
            temp=temp-2;
            System.out.println("");
        }
        temp=temp+2;
        for(int i=0;i<n/2;i++)
        {
        	temp=temp+2;
        	for(int j=0;j<=i;j++)
            	System.out.print(" ");
        	for(int k=n;k>=temp;k--)
        		System.out.print("*");
        	System.out.println("");
        }
        sc.close();
	}
}
