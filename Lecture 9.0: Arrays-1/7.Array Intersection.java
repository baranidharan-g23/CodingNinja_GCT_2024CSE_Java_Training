public class Solution
{  
    public static void intersections(int arr1[], int arr2[]) 
    {
        int n = arr1.length;
        int ms = arr2.length;
        int i , temp = 0, j, m = 0;
        for(i =0;i<n;i++)
        {
            temp = 0;
            for(j = 0;j<ms;j++)
            {
                if(arr1[i]==arr2[j])
                	{temp = 1;
                     arr2[j]=-1;
                	break;
                	}
            }
            if(temp==1)
            {
                m = arr1[i];
                System.out.print(m+" ");
            }
        }
    }
}
