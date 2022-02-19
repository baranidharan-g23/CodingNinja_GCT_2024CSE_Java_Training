public class Solution 
{
    public static int linearSearch(int arr[], int x) 
    {
        int n = arr.length;
        int i;
        for(i =0;i<n;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
