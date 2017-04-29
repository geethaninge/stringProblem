package com.string;

/**
 * @author Geetha Gowda 
 * @date 04/29/2017
 */
public class StringProblem {
	
   //Approach #1 Iterate through the String, one character at a time
	public static String removeChar(final String str, final char charToRemove) {


		if (str == null) return null;
		final StringBuilder builder = new StringBuilder();
		for (char character : str.toCharArray()) {
			if (character!= charToRemove) {
				builder.append(character);
			}
		}
		return builder.toString();
	}

	//Approach #2 Find a method in the String class that can solve this in one line
	public static String removeCharOneLine(final String str, final char charToRemove) {
		if (str == null) return null;
		return str.replaceAll( String.valueOf(charToRemove), "");
	}
}
