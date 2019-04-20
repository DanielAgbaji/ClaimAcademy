
import java.util.Scanner;
public class RemoveChar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the word that has letter 'a' in it");
		
		String word = input.nextLine();
		
		System.out.println("Your new String after "
				+ "removing the first 'a'letter is: " +word.replaceFirst("a",  ""));
		
		
	

	}

}
