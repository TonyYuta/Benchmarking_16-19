/**
 *   File Name: PerformanceHashMap.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

import java.util.HashMap;

public class PerformanceHashMap {
	
	public static void main(String args[]) {
		
		int n = 1000000;
		long startTime;
		long endTime;
		long duration;
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// PUT
		startTime = System.nanoTime();
		for (Integer i = 0; i < n; i++) {
			hm.put(i, "John Smith");
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("HashMap puts:  " + duration);
		// GET
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			hm.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("HashMap gets:  " + duration);
		// REMOVE
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			hm.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("HashMap remove:  " + duration);
	}
}
