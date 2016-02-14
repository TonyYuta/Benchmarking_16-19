/**
 *   File Name: Bench16.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

/**
 * Bench16 //ADDD (description of class)
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
public class Bench16 {

	public static void main(String[] args) {
		long num = 1_000_000_000;
		
		//performance comparison between byte vs. Byte by adding the value to itself 1,000,000,000 times 
		byte b = 0;
		final long startB = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			++b;
		}
		final long finishB = System.currentTimeMillis();
		final long resultB = (finishB - startB);
		System.out.print("byte adding time, ms: ");
		System.out.println(resultB);
		
		Byte wb = 0;
		final long startWb = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			++wb;
		}
		final long finishWb = System.currentTimeMillis();
		final long resultWb = (finishWb - startWb);
		System.out.print("Byte adding time, ms: ");
		System.out.println(resultWb);
		
		System.out.println("byte adding is quickly then Byte adding in " + resultWb/resultB + " times");
	}
}
