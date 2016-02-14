/**
 *   File Name: BenchStringBuilder.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

/**
 * BenchStringBuilder //ADDD (description of class)
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
public class BenchStringBuilder {
	 public static void main(String[] args) {
	
 final long start = System.currentTimeMillis();

		 StringBuilder string = new StringBuilder("a");
		int max = 1_000_000;
	
for (int i = 0; i < max; i++) {
 string = string.append("b");
	 }
 final long finish = System.currentTimeMillis();
		final long result = (finish - start);
	
		System.out.println("Using StringBuilder, elapsed milliseconds: " + result);
	 }
}

