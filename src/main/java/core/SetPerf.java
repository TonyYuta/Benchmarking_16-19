package core;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetPerf {
 public static void main(String[] args) {
TreeSet<Integer> treeSet = new TreeSet<Integer>();
LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
HashSet<Integer> hashSet = new HashSet<Integer>();

// HashSet add
long startTime = System.nanoTime();
for (int i = 0; i < 100000; i++) {
hashSet.add(i);
}
long endTime = System.nanoTime();
long duration = endTime - startTime;
System.out.println("HashSet add: " + duration);
// LinkedHashSet add
startTime = System.nanoTime();
for (int i = 0; i < 100000; i++) {
linkedHashSet.add(i); }
 endTime = System.nanoTime();
 duration = endTime - startTime;
System.out.println("LinkedHashSet add:  " + duration);
System.out.println("");
 // TreeSet add
startTime = System.nanoTime();
for (int i = 0; i < 100000; i++) {
treeSet.add(i); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("TreeSet add:  " + duration);

////////////////////////////////////////////////////////////////
// HashSet iterate all
startTime = System.nanoTime();
Iterator<Integer> ihs = hashSet.iterator();
while (ihs.hasNext()) {
@SuppressWarnings("unused")
int i = ihs.next(); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("HashSet iterate all:  " + duration);
// LinkedHashSet iterate all
startTime = System.nanoTime();
Iterator<Integer> ilhs = linkedHashSet.iterator();
while (ilhs.hasNext()) {
@SuppressWarnings("unused")
int i = ilhs.next(); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("LinkedHashSet iterate all:  " + duration);
// TreeSet iterate all
startTime = System.nanoTime();
Iterator<Integer> its = treeSet.iterator();
while (its.hasNext()) {
@SuppressWarnings("unused")
int i = its.next(); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("TreeSet iterate all:  " + duration);
System.out.println("");
////////////////////////////////////////////////////////////////
// HashSet remove
startTime = System.nanoTime();

for (int i = 9999; i >=0; i--) {
hashSet.remove(i); }
endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("HashSet remove: " + duration);
// LinkedHashSet remove
startTime = System.nanoTime();
 for (int i = 9999; i >=0; i--) {
 linkedHashSet.remove(i); }
 endTime = System.nanoTime();
duration = endTime - startTime;
System.out.println("LinkedHashSet remove: " + duration);
// TreeSet remove
 startTime = System.nanoTime();

 for (int i = 9999; i >=0; i--) {
treeSet.remove(i); }
endTime = System.nanoTime();
 duration = endTime - startTime;
System.out.println("TreeSet remove:  " + duration);
}
}