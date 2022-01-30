public class Solution 
{
	public static void printFahrenheitTable(int start, int end, int step) 
  {
        int fah;
		for(int i = start; i<=end; i = i+step)
    {
    	fah = (5*(i-32))/9;
    	System.out.println(i+"\t"+fah);
    	fah = 0;
    }
	}
}
