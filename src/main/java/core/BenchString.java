/**
 *   File Name: BenchString.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

/**
 * BenchString //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class BenchString {
	
	public static void main(String[] args) {	
		
		// performance comparison between String vs. StringBuffer vs. StringBuilder
		// by concatenating (appending) string "a" and "b" 1,000,000 times

	final long start = System.currentTimeMillis();
	String string = "a";
	int max = 1_000_000;
	for (int i = 0; i < max; i++) {
		string = string.concat("b");
	}
	final long finish = System.currentTimeMillis();
	final long result = (finish - start);
		System.out.println("Using String, elapsed milliseconds: " + result);
	}
		
}

