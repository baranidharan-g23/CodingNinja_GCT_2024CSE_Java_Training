public class Solution 
{
    public static int pairSum(int arr[], int x) 
    {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n;i++)
        {
            for(int j = i+1; j<n;j++)
            {
                if((arr[i]+arr[j]) == x)
                    count++;
                else
                    continue;
            }
        }
        return count;
    }
}
