package palindrome;

import java.util.LinkedList;

public class Palindrome {

	public static void main(String[] args) {
		long start = System.nanoTime();
		String toCheck = "100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002";
		int counter = 0;
		boolean isPalindrome = false;
		
		LinkedList<Character> originalWord = new LinkedList<Character>();
		LinkedList<Character> reverseWord = new LinkedList<Character>();
		
		for(int i = 0; i < toCheck.length(); i++) {
			originalWord.add(toCheck.charAt(i));
		}
		
		for(int i = toCheck.length(); i > 0; i--) {
			reverseWord.add(toCheck.charAt(i-1));
		}
		
		//System.out.println(originalWord.toString());
		//System.out.println(reverseWord.toString());
		
		while(counter < toCheck.length()) {
			if(originalWord.get(counter) != reverseWord.get(counter)) {
				isPalindrome = false;
				break;
			}
			isPalindrome = true;
			counter++;
		}
		
		long end = System.nanoTime();
		
		if(isPalindrome) {
			System.out.println(toCheck + " is a palindrome!");
		}else {
			System.out.println(toCheck + " is not a palindrome.");
		}
		
		System.out.printf("The run time is %d", (end-start));
	}
}
