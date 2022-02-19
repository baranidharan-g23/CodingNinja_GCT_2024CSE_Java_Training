public class Solution
{  
    public static int findUnique(int[] arr)
    {
         int n = arr.length;
        int i , temp = 0, j, m = 0;
        for(i =0;i<n;i++)
        {         
            temp = 0;
            for(j = 0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                	{
                  temp = 1;
                	break;
                	}                
            }
            if(temp==0)
            {
                m = arr[i];
                return m;
            }  
        }
        return m;
    }
}
