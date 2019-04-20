
public class Position {
	
	// Takes input and returns everything lower-case:
	public String toLowerCase(String input) {
		
		for(int i = 0; i < input.length(); ++i)
        {
            char letter = input.charAt(i);
            if(letter/2 == 0) {
                input = input.toLowerCase();
            }
         System.out.println(input);
            }
		return input;
            
	}

	// 
    public String toUpperCase(String input) {
    	for(int i = 0; i < input.length(); ++i)
	        {
	            char letter = input.charAt(i);
	            if(letter/2!=0) {
	        	    input = input.toUpperCase(); 
	            }
	            System.out.println(input);
	        }
		return input;
		
		}
	}


