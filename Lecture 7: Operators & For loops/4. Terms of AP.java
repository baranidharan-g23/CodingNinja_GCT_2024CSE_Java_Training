import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=0,count=0;
		for(int i =1;count<=n;i++)
		{
			temp = (3*i)+2;
			if(temp%4!=0)
				{System.out.print(temp+" ");
				 count++;
				}
			if(count==n)
				break;
		}
		sc.close();
		
	}
}
