package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Convert a phrase to its acronym. Teachers love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		char acronymL = ' ';
		String acronym = "";
		
		
		// loop through the string
		//grab the first character of the string as well as eah after a space or hyphen and append it the total
		
		//total string used after converting the temp string to uppercase
		String total = "";
		String temp = "";
		
		//adds the first character in the String. Freebie
		temp += phrase.charAt(0);
        
        for (int i = 1; i <= phrase.length() - 1; i++) {
        	//during the loop, if there's a space or a hyphen, increment the current character into the acronym string
            if (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-') {
                temp += phrase.charAt(i);
            }
        }
        total = temp.toUpperCase(); 
				
		System.out.println(total);
		return null;
	}

	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; 
	 *  D, G = 2;
	 *  B, C, M, P = 3; 
	 *  F, H, V, W, Y = 4; 
	 *  K = 5;
	 *  J, X = 8; 
	 *  Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// variables:
		// total - hold the final score (int)
		//
		// method:
		// loop through the string
		// convert string to lower-case
		// check each character for point
		// increment total based on each character's point value
		
		
		//method on how to get a number from a list of val:
		// loop through the array of each val with a for loop, then if one of those values
		// equals a member of the string, add points
		// *this was changed to use for each loops, after several attempts at using standard for loops showed 0 results
		int total = 0;		
		
		
		char[] val1 = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'}; //1 point
		char[] val2 = {'d', 'g'}; //2 points
		char[] val3 = {'b', 'c', 'm', 'p'}; //3 points
		char[] val4 = {'f', 'h', 'v', 'w', 'y'}; //4 points
		char[] val5 = {'k'}; //5 points
		char[] val6 = {'j', 'x'};//8 points
		char[] val7 = {'q', 'z'};//10 points
		
		
		//version 2:
		//creates a string that will convert the current string to lower-case
		String toLowerCase = string.toLowerCase();
		//creates a char that converts the string to a char
		char[] charS = toLowerCase.toCharArray();
		System.out.println(charS);
		
		//main for each loop that will loop through the current string
		// each nested for loop checks for if the value is within a char[]
		// If it is, it adds the appropriate score for that value
		for (Character c: charS) {
			for (Character v: val1) {
				if (c.equals(v)) {
					total+= 1;
				}
			}
			for (Character v: val2) {
				if (c.equals(v)) {
					total+= 2;
				}
			}
			for (Character v: val3) {
				if (c.equals(v)) {
					total+= 3;
				}
			}
			for (Character v: val4) {
				if (c.equals(v)) {
					total+= 4;
				}
			}
			for (Character v: val5) {
				if (c.equals(v)) {
					total+= 5;
				}
			}
			for (Character v: val6) {
				if (c.equals(v)) {
					total+= 8;
				}
			}
			for (Character v: val7) {
				if (c.equals(v)) {
					total+= 10;
				}
			}
		}
			
		System.out.println("total = " + total);
		return total;
	}	 
	public String loopVal(String str) {
		
		return str;
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		char[] a = string.toCharArray();
		String result = "";
		
		//loops through the string with a for each loop (using the c for comparing in the if block)
		for (Character c : a) {
			//check to see if the value is a number, if so then enter it into the result
			if (c == '0' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
				result += c;
			}
			//if not, then continue the loop. This removes any special characters or letters
			else {
				continue;
			}
		}
		
		System.out.println(result);
		return result;
	}

	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	
	//UNFINISHED
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map<String, Integer> result = new HashMap<>();
		
		String[] splitS = string.split(" ");
//		System.out.println(Arrays.deepToString(splitS));
		
		
		
		
		
		
		
		//append the repeating string and occurrences to the HashMap result
		//to do this, loop through the string, and if there's a word, add it to the hashMap
		System.out.println(string);
		
		//variable for holding
		String temp = " ";
//		System.out.println(string.indexOf("of"));
		//for loop that checks if the current value is 
		
		//could be useful
//		if (string.indexOf(temp) == -1) {
////			continue;
//		}else if(){
//			
//		}
		//number for tracking how many strings there are
//		int numStrings = 0;
//		char[] sChar = string.toCharArray();
//		temp += string.charAt(1);
//		for (Character j : sChar) {
//			if (j == ' ') {
////				System.out.println("numbersLUL");
//				temp += string.charAt(j);
//			}
//		}
//		System.out.println(temp);
		
		
		for (int i = 0; i < string.length(); i++) {
			//check if the string has already been collected, if not then add it to the list
			//if it has, then add the number of occurrences for that string
			
		}
		
		return result;
//		return null;
	}

	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 6. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		return false;
	}

	/**
	 * 7. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 8-9. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 8
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			char[] word = string.toCharArray();
			System.out.println(word);
			char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
					's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			
			List<String> listV2 = new ArrayList<String>();
			
			String finalWord = "";
			
			//temp variable to hold the current index
			int index = 0;
			
			//find the number within the list, then find the reverse of it
			//
			
			
			
			
//			for (Character d : list) {
//				for (Character s : word) {
//					if (d.equals(s)) {
//						finalWord+= s;
//						
//					}
//				}
//			}
			
			
			
			
			System.out.println(finalWord);
			return string;
//			return null;
		}

		/**
		 * Question 9
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}
	}

	/**
	 * 10. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

}
