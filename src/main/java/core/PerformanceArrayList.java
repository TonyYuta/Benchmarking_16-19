/**
 *   File Name: PerformanceArrayList.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

import java.util.ArrayList;

public class PerformanceArrayList {

	public static void main(String[] args) {
		
		int n = 1000000;
		long startTime;
		long endTime;
		long duration;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// ADD
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		// GET
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);
		// REMOVE
		startTime = System.nanoTime();
		for (int i = n - 1; i > 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);
	}
}
