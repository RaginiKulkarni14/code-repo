package com.java.basic.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * https://www.geeksforgeeks.org/remove-duplicate-words-from-sentence-using-regular-expression/
 
    “\\b”: A word boundary. Boundaries are needed for special cases. For example, in “My thesis is great”, “is” wont be matched twice.
    “\\w+” A word character: [a-zA-Z_0-9]
    “\\W+”: A non-word character: [^\w]
    “\\1”: Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
    “+”: Match whatever it’s placed after 1 or more times
 */

/*
    1) Write a RegEx that will match any repeated word.
    2) Complete the second compile argument so that the compiled RegEx is case-insensitive.
    3) Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. 
    It must be the exact first occurrence of the word, as the expected output is case-sensitive
 */

public class DuplicateWords {

	public static void main(String[] args) {

		String regex = " \\b(\\w+)(?:\\W+\\1\\b)+ "; /* Write a RegEx matching repeated words here. */
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE); /* Insert the correct Pattern flag here.*/

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1)); /* The regex to replace */ /* The replacement. */
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
	}

}
