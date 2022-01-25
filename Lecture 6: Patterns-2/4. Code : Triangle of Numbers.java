import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int a=i+1;
            for(int j=i+1;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(a);
                a++;
            }
            a--;
            for(int k=1;k<=i;k++)
            {
                a--;
                System.out.print(a);
            }
            System.out.println("");
        }
        sc.close();
	}
}
