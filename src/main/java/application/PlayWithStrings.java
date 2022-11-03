package application;

import javax.swing.*;
import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");
		printIntitials("Sebastian","Otter-Bäck");
		System.out.println(areAnagrams("soft ware", "swear.oft"));
		System.out.println(isPalindrome("Hannah"));

	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {
		String iniFirst = firstname.substring(0,1);
		String iniLast = lastname.substring(0,1);
		String initials = iniFirst + " " + iniLast;
		System.out.println(initials);
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {
		value1 = value1.replaceAll("\\s", "").replaceAll("\\.","");
		value2 = value2.replaceAll("\\s", "").replaceAll("\\.","");

		if (value1.length()!=value2.length()){
			return false;
		}

		char[] arrayV1 = value1.toLowerCase().toCharArray();
		char[] arrayV2 = value2.toLowerCase().toCharArray();

		Arrays.sort(arrayV1);
		Arrays.sort(arrayV2);

		return Arrays.equals(arrayV1, arrayV2);

	}


	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		String revValue = "";
		for (int i = 0; i < value.length();i++){
			revValue = value.charAt(i) + revValue;
		}
		char[] valueNormal = value.toLowerCase().toCharArray();
		char[] valueReverse = revValue.toLowerCase().toCharArray();
//		System.out.println(Arrays.toString(valueNormal) + "<- Normal / Reverse -> "+ Arrays.toString(valueReverse));
		return Arrays.equals(valueNormal, valueReverse);
	}
}
