public class Solution 
{    
    public static void swapAlternate(int arr[]) 
    {
        int n = arr.length;
        int j=1,temp;
        for(int i = 0;i<n-1;i=i+2)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j = j+2;
        }
    }
}
