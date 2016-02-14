/**
 *   File Name: PerformanceTreeSet.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

import java.util.Iterator;
import java.util.TreeSet;

public class PerformanceTreeSet {

	public static void main(String[] args) {
		
		int n = 1000000;
		long startTime;
		long endTime;
		long duration;
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		// ADD
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			ts.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet add:  " + duration);
		// ITERATE
		startTime = System.nanoTime();
		Iterator<Integer> its = ts.iterator();
		while (its.hasNext()) {
			@SuppressWarnings("unused")
			int i = its.next();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet iterate:  " + duration);
		// REMOVE
		startTime = System.nanoTime();
		for (int i = n - 1; i > 0; i--) {
			ts.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet remove:  " + duration);
	}
}
