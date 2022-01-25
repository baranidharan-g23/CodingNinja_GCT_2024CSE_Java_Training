import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        int j,i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");
        for(i =1;i<=n;i++)
        {
            System.out.print("*");
            for(j=1;j<i;j++)
                System.out.print(j);
            for(int k=j;k>=1;k--)
                System.out.print(k);
            System.out.print("*\n");
        }
        for(int l=n-1;l>=1;l--)
        {
            System.out.print("*");
            for(j=1;j<l;j++)
                System.out.print(j);
            for(int k=j;k>=1;k--)
                System.out.print(k);
            System.out.print("*\n");
        }
        System.out.println("*");
        sc.close();
    }
}

        
        
        
        
