package core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Vector;
public class BM {
public static void main(String[] args) { 
ArrayList<Integer> arrayList = new ArrayList<Integer>();
LinkedList<Integer> linkedList = new LinkedList<Integer>();
Vector<Integer> vector = new Vector<Integer>();

// ArrayList add
long startTime = System.nanoTime();
for (int i = 0; i < 100000; i++) {
arrayList.add(i);
}
long endTime = System.nanoTime();
long duration = endTime - startTime;
System.out.println("ArrayList add:  " + duration);

// LinkedList add
startTime = System.nanoTime();

for (int i = 0; i < 100000; i++) {
linkedList.add(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("LinkedList add: " + duration);

// Vector add
 startTime = System.nanoTime();
for (int i = 0; i < 100000; i++) {
 vector.add(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("Vector add: " + duration);
System.out.println("");

// ArrayList get
startTime = System.nanoTime();

for (int i = 0; i < 10000; i++) {
arrayList.get(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("ArrayList get:  " + duration);

// LinkedList iterate all
//startTime = System.nanoTime();
//Iterator<Integer> list_i = list.iterator();
//while (list_i.hasNext()) {
//	@SuppressWarnings("unused")
//	int i = list_i.next(); 
//	}
//endTime = System.nanoTime();
//duration = endTime - startTime;
//System.out.println("LinkedList iterate all: " + duration);

// Vector get
startTime = System.nanoTime();
for (int i = 0; i < 10000; i++) {
vector.get(i); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("Vector get: " + duration);
System.out.println("");

// ArrayList remove
startTime = System.nanoTime();

for (int i = 9999; i >=0; i--) {
arrayList.remove(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("ArrayList remove:  " + duration);

// LinkedList remove
startTime = System.nanoTime();
 for (int i = 9999; i >=0; i--) {
 linkedList.remove(i);
}
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("LinkedList remove: " + duration);

// Vector remove
startTime = System.nanoTime();

for (int i = 9999; i >=0; i--) {
 vector.remove(i);
}
endTime = System.nanoTime();
 duration = endTime - startTime;
System.out.println("Vector remove: " + duration);
	}
}