import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
  {
		int s,e,w,fah,i;
        Scanner sc = new Scanner(System.in);
		    s=sc.nextInt();
        e=sc.nextInt();
        w=sc.nextInt();
        for(i=s;i<=e;i=i+w)//iterates till the end value with interval "w"
        {
            fah=(int)((i-32)*5)/9;//formula for celsius to fahrenheit
            System.out.println(i+" "+fah);
        }
	}
}
