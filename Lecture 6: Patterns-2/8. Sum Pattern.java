import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int w=1;w<=n;w++)
        {
            count=0;
            for(int i = 1;i<=w;i++)
        {
            System.out.print(i);
            if(i!=w)
                System.out.print("+");
            if(i==w)
                System.out.print("=");
            count=count+i;
            if(i==w)
                System.out.println(count);
        }
         
        }
        sc.close();
	}
}
