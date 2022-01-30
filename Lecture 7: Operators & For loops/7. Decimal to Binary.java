import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc = new Scanner(System.in);
	int dec = sc.nextInt();
	int rem;
	String strs = "";
    if(dec == 0)
        System.out.print("0");
        
	while(dec != 0)
	{
		rem = dec%2;
		dec/=2;
		strs += rem;
		//System.out.println(strs);
	}
	//int bin = Interger.valueOf(strs);
	//strs.reverse();
	dec = strs.length();
	for(int i = dec-1;i>=0;i--)
	System.out.print(strs.charAt(i));
	sc.close();
	}
}
