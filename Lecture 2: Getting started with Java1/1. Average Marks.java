
import java.util.Scanner;//importing Scanner library to use Scanner function
public class Solution 
{
	public static void main(String[] args) //main function
  {
	Scanner scan = new Scanner(System.in);
	String Name = scan.next();//Scanning string
    	char name = Name.charAt(0);//charAt function stores the nth character of a string to the assigned var
    	int mark1 = scan.nextInt();
    	int mark2 = scan.nextInt();
    	int mark3 = scan.nextInt();
	System.out.println(name);//prints the selected string
    	System.out.print((n1+n2+n3)/3);//prints average of 3 marks
	}
}
