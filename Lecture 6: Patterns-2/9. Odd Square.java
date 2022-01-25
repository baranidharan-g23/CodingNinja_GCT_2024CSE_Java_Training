import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) 
  {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int fina=(2*n)-1;
        int a =1,b=0;
        for (int i = 1;i<=n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(j==0)
                {
                    b=a;
                }               
                if(a<=fina)
                {
                    System.out.print(a);
                    if(a!=fina)
                    a=a+2;
                    if(a==fina&&b!=fina)
                    {
                    	System.out.print(a);
                    	j++;
                    }
                }                
                   if(a==fina)
                   {
                       a=1;
                       for(int k=1;k<((b+1)/2);k++)
                       {
                           j++;
                           System.out.print(a);
                           a=a+2;
                       }                       
                   }                                       	                             
                if(a>fina)
                {
                    break;
                }   
            }  
            a=(2*(i+1)-1);
       System.out.println("");
        }
        sc.close();
	}
}

