import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b,count = 0;
    if(n==0)
        System.out.print("0");
	while(n!=0)
	{
		b=n%10;
		n/=10;
		if(count == 0 && b == 0)
			continue;
		else
		{
			System.out.print(b);
			count=1;
		}
	}
	sc.close();
	}
}
