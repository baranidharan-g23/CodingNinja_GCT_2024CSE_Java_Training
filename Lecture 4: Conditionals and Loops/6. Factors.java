import java.util.Scanner;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (sc != null)
            sc.close();
        int b;
        int a2=a/2;
        for(int i = 2;i<=a2;i++)
        {
            b = a%i;
            if (b==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
