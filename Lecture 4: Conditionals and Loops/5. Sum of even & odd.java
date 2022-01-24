import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
  {
		int a;
    Scanner sc = new Scanner(System.in);
	  int b=1,even=0,odd=0;
    a = sc.nextInt();
		for(int i = 0;i<=10;i++)
		{
		    b=a%10;
		    a/=10;
		    if(b%2==0)
		    {
		       even+=b;
		    }
		    else
        {
          odd+=b;
        }
		}
		System.out.println(even+" "+odd);
	}
}
