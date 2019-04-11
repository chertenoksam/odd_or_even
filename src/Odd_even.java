import java.util.Scanner;
/*- Asks the user for a number
- If the number is odd, tell them it’s odd! If it's even tell them that their number is not odd. 
*/

public class Odd_even 

{

	public static void main(String[] args)
	
	{
	int n;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number you want to check:");
	n = s.nextInt();
	if(n % 2 == 0)
	{
		System.out.println("The given number " +n+ " is even.");
	}
	else
	{
	System.out.println("The given number " +n+ " is odd.");
	}
}
}
