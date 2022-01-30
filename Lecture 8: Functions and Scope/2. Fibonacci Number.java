
public class Solution 
{
	public static boolean checkMember(int n)
  {
        int fst = 1;
        int sec = 1;
        int val = 0;
        boolean count = false;
        while(n>=val)
        {
            val = fst + sec;
            fst = sec;
            sec = val;
            if(n == 1)
                count = true;
            if(n == 0)
                count = true;
            if(n == val)
				count = true;
        }
        return count;
	}	
}
