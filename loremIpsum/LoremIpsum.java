package loremIpsum;

import java.util.Random;

/**
* Generates random paragraphs of dummy text.
*
*@author Kevin Dapper
**/
public class LoremIpsum {

	private static Random rand = new Random();
	
	/**
	 * Unit Testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		paragraph();
		System.out.println("\n");
		
		paragraph();
		System.out.println("\n");
		
		paragraph();
		System.out.println("\n");
		
	}
	
	/**
	* Generates a word between 1-18 characters.
	*
	*@return String a word
	**/
	private static String word() {
		int wordSize = rand.nextInt(18) + 1;
		String word = "";
		for(int i = 0; i < wordSize; i++) {
			word += Character.toString((char) (rand.nextInt(26) + 'A'));
		}
		return word;
	}
	
	/**
	* Generates a sentence between 6-12 words.
	*
	*@return String a sentence
	**/
	private static String sentence() {
		int sentenceSize = rand.nextInt(5) + 6;
		String sentence = "";
		for(int i = 0; i < sentenceSize; i++) {
			if(i == sentenceSize-1) {
				sentence += word() + ".";
			}else {
				sentence += word() + " ";
			}
		}
		return sentence;
	}
	
	/**
	* Generates and prints a paragraph with 3-6 sentences.
	*
	**/
	private static void paragraph() {
		int paragraphSize = rand.nextInt(4) + 3;
		String[] paragraph = new String[paragraphSize];
		for(int i = 0; i < paragraphSize; i++) {
			paragraph[i] = sentence();
			System.out.print(paragraph[i]);
			if(i != paragraphSize-1) {
				System.out.print(" ");
			}
			if(i > 1 && i % 2 == 0 ) {
				System.out.println();
			}
		}
	}
}
