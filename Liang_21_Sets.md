Collection->Set->TreeSet(implements SortedSet, NavigatableSet)
Collection->Set->HashSet
Collection->Set->HashSet->LinkedHashSet

java.util.HashSet<E>
+HashSet()
+HashSet(c: Collection<? extends E>)
+HashSet(initialCapacity: int)
+HashSet(initialCapacity: int, loadFactor: float)

java.util.LinkedHashSet<E>
+LinkedHashSet()
+LinkedHashSet(c: Collection<? extends E>)
+LinkedHashSet(initialCapacity: int)
+LinkedHashSet(initialCapacity: int, loadFactor: float)

java.util.TreeSet<E>
+TreeSet()
+TreeSet(c: Collection<? extends E>)
+TreeSet(comparator: Comparator<?
super E>)
+TreeSet(s: SortedSet<E>)

«interface» java.util.SortedSet<E>
+first(): E
+last(): E
+headSet(toElement: E): SortedSet<E>
+tailSet(fromElement: E): SortedSet<E>

«interface» java.util.NavigableSet<E>
+pollFirst(): E
+pollLast(): E
+lower(e: E): E
+higher(e: E):E
+floor(e: E): E
+ceiling(e: E): E


Member test time for hash set is 20 milliseconds
Remove    element time for hash set is 27 milliseconds
Member    test time for linked hash set is 27 milliseconds
Remove   element time for linked hash set is 26 milliseconds
Member   test time for tree set is 47 milliseconds
Remove   element time for tree set is 34 milliseconds
Member   test time for array list is 39802 milliseconds
Remove    element time for array list is 16196 milliseconds
Member    test time for linked list is 52197 milliseconds
Remove   element time for linked list is 14870 milliseconds



 
 
 
 


 
