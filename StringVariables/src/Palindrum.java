/**
 * 
 */
/**
 * @author danielagbaji
 *
 */
import java.util.Scanner;

public class Palindrum {

	//main method-execution starts
	public static void main(String[] args) {
		String a, b= "";
		
		//user is asked to input their String Value
		//f@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the word: ");
		
		a = input.nextLine();
		System.out.println();
		
		// calculates the length of the value inputed
		
		int n = a.length();
		
		// loop through to verify the characters in the string input
		
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        
        // use a condition to check for equality in the string inputed
        
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
		

	}

}
