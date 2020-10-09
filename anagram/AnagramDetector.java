package anagram;

import java.util.*;

/**
 * This program will determine whether two words are anagrams for one another. 
 * 
 * @author Kevin Dapper
 *
 */
public class AnagramDetector {

	/**
	 * Unit Testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Compares the two words to see if they are anagrams.
	 * 
	 * @param test first word to check
	 * @param original second work to check
	 * @return true if anagrams and false otherwise
	 */
	public static boolean isAnagram(String test, String original) {
		if (test == null || original == null || test.length() != original.length())
			return false;

		char ch1[] = test.toLowerCase().toCharArray();
		char ch2[] = original.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}

}
