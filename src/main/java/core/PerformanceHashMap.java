/**
 *   File Name: PerformanceHashMap.java<br>
 *
 *   Yutaka<br>
 *   Created: Feb 13, 2016
 *   
 */

package core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PerformanceHashMap {
	
	public static void main(String args[]) {
		
		int n = 1000000;
		long startTime;
		long endTime;
		long duration;
		
		// HashMap
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
		
		// Hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		// PUT
		startTime = System.nanoTime();
		for (Integer i = 0; i < n; i++) {
			ht.put(i, "John Smith");
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Hashtable puts:  " + duration);
		
		// GET
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			ht.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Hashtable gets:  " + duration);
		
		// REMOVE
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			ht.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Hashtable remove:  " + duration);
		
		// LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap(); 
			
			// PUT
			startTime = System.nanoTime();
			for (Integer i = 0; i < n; i++) {
				lhm.put(i, "John Smith");
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap puts:  " + duration);
			
			// GET
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++) {
				lhm.get(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap gets:  " + duration);
			
			// REMOVE
			startTime = System.nanoTime();
			for (int i = 0; i < n; i++) {
				lhm.remove(i);
			}
			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("LinkedHashMap remove:  " + duration);
		
			// TreeMap
			 TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
			 
				
				// PUT
				startTime = System.nanoTime();
				for (Integer i = 0; i < n; i++) {
					tm.put(i, "John Smith");
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("TreeMap puts:  " + duration);
				
				// GET
				startTime = System.nanoTime();
				for (int i = 0; i < n; i++) {
					tm.get(i);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("TreeMap gets:  " + duration);
				
				// REMOVE
				startTime = System.nanoTime();
				for (int i = 0; i < n; i++) {
					tm.remove(i);
				}
				endTime = System.nanoTime();
				duration = endTime - startTime;
				System.out.println("TreeMap remove:  " + duration);
			 
	}
}
