import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
  {
		    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        for(int i = 1;i<=10;i++)
        {
            b=a*i;
            System.out.println(b+"\n");
        }
	}
}
