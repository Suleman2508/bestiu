package org.tns.capgemini.c2tc.String;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
        String str = "   Hello, World!   ";

        int length = str.length();
        System.out.println("Length of the string: " + length);

        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        String substringFrom7 = str.substring(7);
        System.out.println("Substring from index 7: " + substringFrom7);

        String substringFrom7To12 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringFrom7To12);

        String replacedString = str.replace("World", "Java");
        System.out.println("Replaced string: " + replacedString);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseStr);
        
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseStr);

        String trimmedStr = str.trim();
        System.out.println("Trimmed string: " + trimmedStr);

        String[] fruits = "apple,grapes,banana".split(",");
        System.out.println("Splitted strings:");
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }

        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        boolean startsWithSpaces = str.startsWith("   ");
        System.out.println("Starts with spaces: " + startsWithSpaces);
        
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);

        int number = 1234;
        String numberStr = String.valueOf(number);
        System.out.println("String representation of the number: " + numberStr);

	}

}