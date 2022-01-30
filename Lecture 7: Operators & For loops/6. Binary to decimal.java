import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b,dec=0,c=1;
	while(n!=0)
	{
		b=n%10;
		n/=10;
		dec+=(b*c);
		c*=2;
	}
	System.out.print(dec);
	sc.close();
	}
}
