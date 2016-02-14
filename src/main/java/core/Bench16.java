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
		long num = 1_000_000_000L;
		
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
		for (long i = 0; i < num; i++) {
			++wb;
		}
		final long finishWb = System.currentTimeMillis();
		final long resultWb = (finishWb - startWb);
		System.out.print("Byte adding time, ms: ");
		System.out.println(resultWb);
		
		System.out.println("byte adding is quickly then Byte adding in " + resultWb/resultB + " times");
		
		//performance comparison between short vs. Short by adding the value to itself 1,000,000,000 times 
		short s = 0;
		final long startS = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++s;
		}
		final long finishS = System.currentTimeMillis();
		final long resultS = (finishS - startS);
		System.out.print("\nshort adding time, ms: ");
		System.out.println(resultS);
		
		Short ws = 0;
		final long startWs = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++ws;
		}
		final long finishWs = System.currentTimeMillis();
		final long resultWs = (finishWs - startWs);
		System.out.print("Short adding time, ms: ");
		System.out.println(resultWs);
		
		System.out.println("short adding is quickly then Short adding in " + resultWs/resultS + " times");
		
		
		//performance comparison between int vs. Integer by adding the value to itself 1,000,000,000 times 
		int in = 0;
		final long startIn = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++in;
		}
		final long finishIn = System.currentTimeMillis();
		final long resultIn = (finishIn - startIn);
		System.out.print("\nint adding time, ms: ");
		System.out.println(resultIn);
		
		Integer wi = 0;
		final long startWi = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++wi;
		}
		final long finishWi = System.currentTimeMillis();
		final long resultWi = (finishWi - startWi);
		System.out.print("Integer adding time, ms: ");
		System.out.println(resultWi);
		
		System.out.println("int adding is quickly then Integer adding in " + resultWi/resultIn + " times");
		
		
		//performance comparison between long vs. Long by adding the value to itself 1,000,000,000 times 
		long l = 0L;
		final long startL = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++l;
		}
		final long finishL = System.currentTimeMillis();
		final long resultL = (finishL - startL);
		System.out.print("\nlong adding time, ms: ");
		System.out.println(resultL);
		
		Long wl = 0L;
		final long startWl = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++wl;
		}
		final long finishWl = System.currentTimeMillis();
		final long resultWl = (finishWl - startWl);
		System.out.print("Long adding time, ms: ");
		System.out.println(resultWl);
		
		System.out.println("long adding is quickly then Long adding in " + resultWl/resultL + " times");
		
		
		//performance comparison between float vs. Float by adding the value to itself 1,000,000,000 times 
		float f = 0.0F;
		final long startF = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++f;
		}
		final long finishF = System.currentTimeMillis();
		final long resultF = (finishF - startF);
		System.out.print("\nfloat adding time, ms: ");
		System.out.println(resultF);
		
		Float wf = 0.0F;
		final long startWf = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++wf;
		}
		final long finishWf = System.currentTimeMillis();
		final long resultWf = (finishWf - startWf);
		System.out.print("Float adding time, ms: ");
		System.out.println(resultWf);
		
		System.out.println("float adding is quickly then Float adding in " + resultWf/resultF + " times");
		
		
		//performance comparison between double vs. Double by adding the value to itself 1,000,000,000 times 
		double d = 0.0D;
		final long startD = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++d;
		}
		final long finishD = System.currentTimeMillis();
		final long resultD = (finishD - startD);
		System.out.print("\ndouble adding time, ms: ");
		System.out.println(resultD);
		
		Double wd = 0.0D;
		final long startWd = System.currentTimeMillis();
		for (long i = 0; i < num; i++) {
			++wd;
		}
		final long finishWd = System.currentTimeMillis();
		final long resultWd = (finishWd - startWd);
		System.out.print("Double adding time, ms: ");
		System.out.println(resultWd);
		
		System.out.println("double adding is quickly then Double adding in " + resultWd/resultD + " times");
	}
}
