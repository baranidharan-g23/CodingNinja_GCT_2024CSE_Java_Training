public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right)
        {
            if(arr[left]==1&&arr[right]==0)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
            else if(arr[left] == 1&&arr[right]==1)
                right--;
            else
                left++;
        }
    }
}
