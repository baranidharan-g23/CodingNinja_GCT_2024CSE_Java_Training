import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
			
Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int next=1,nextb=1,c=1;
	for(int i =3;i<=n;i++)
	{
		c= next+nextb;
		nextb = next;
		next = c;
	}
	System.out.println(c);
	sc.close();
		
	}

}
