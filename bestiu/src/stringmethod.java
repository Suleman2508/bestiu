
public class stringmethod {

	public static void main(String[] args) {

		 
		        String str = "  Hello, World!  ";

		        // Using various string methods
		        System.out.println("Original: '" + str + "'");
		        System.out.println("Length: " + str.length());
		        System.out.println("First character: " + str.charAt(0));
		        System.out.println("Substring: " + str.substring(2, 7));
		        System.out.println("Index of 'World': " + str.indexOf("World"));
		        System.out.println("Lowercase: " + str.toLowerCase());
		        System.out.println("Uppercase: " + str.toUpperCase());
		        System.out.println("Trimmed: '" + str.trim() + "'");
		        System.out.println("Replaced: " + str.replace('o', '0'));
		        System.out.println("Split: " + String.join(", ", str.split(", ")));
		        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
		        System.out.println("Contains 'World': " + str.contains("World"));
		    }
		


	}


