import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int n = sc.nextInt();
		int a=0;
		if(n==2)
			a=1;
        if(n==1||n==2)
        {
		for(int i =1;i<=val;i++)
		{
			if(n==1)
			{
				a+=i;
			}
			else if(n==2)
			{
				a*=i;
			}
		}
		System.out.println(a);
        }
        else
            System.out.println("-1");
		sc.close();

	}
}
