public class Solution 
{
    public static void arrange(int[] arr, int n) 
    {
        int num = 1, left=0 , right=n-1;
        while(left<n/2&&right>=n/2)
        {
            arr[left++]=num++;
            arr[right--]=num++;
        }
        if(n%2!=0)
        {
            arr[n/2]=num;
        }        
    }
}
