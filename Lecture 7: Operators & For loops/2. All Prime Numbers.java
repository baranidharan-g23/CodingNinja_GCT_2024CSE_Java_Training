import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =2,val;
		while(i!=n+1)
		{
			val = i;
			for(int j = 2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					i++;
					break;
				}
			}
			if(val == i)
			{
				System.out.println(val);
				i++;
			}
		}
		sc.close();

		
	}
}
