Collection->Set->HashSet->LinkedHashSet
Collection->List->Vector->Stack
Collection->List->ArrayList
Collection->List->LinkedList
Collection->Queue->PriorityQueue

TreeSet
HashSet
LinkedHashSet
Vector
Stack
ArrayList
LinkedList
PriorityQueue
------------
«interface» java.util.Collection<E>
+add(e: E): boolean
+addAll(c: Collection<? extends E>): boolean
+clear(): void
+contains(o: Object): boolean
+containsAll(c: Collection<?>): boolean
+equals(o: Object): boolean
+isEmpty(): boolean
+remove(o: Object): boolean
+removeAll(c: Collection<?>): boolean
+retainAll(c: Collection<?>): boolean Adds a new element e to this collection.
+size(): int
+toArray(): Object[]
+toArray(a: T[]): T[]
---
«interface» java.lang.Iterable<E>
+iterator(): Iterator<E>
+forEach(action: Consumer<? super E>):default void
---
«interface» java.util.Iterator<E>
+hasNext(): boolean
+next(): E
+remove(): void
---------------
«interface» java.util.List<E>
+add(index: int, element: E): void Adds a new element at the specified index.
+addAll(index: int, c: Collection<? extends E>) : boolean
+get(index: int): E 
+indexOf(element: Object): int 
+lastIndexOf(element: Object): int 
+listIterator(): ListIterator<E> 
+listIterator(startIndex: int): ListIterator<E>
+remove(index: int): E
+subList(fromIndex: int, toIndex: int): List<E>
+set(index: int, element: E): E
---
«interface» java.util.ListIterator<E>
+add(o: E): void
+hasPrevious(): boolean
+nextIndex(): int
+previous(): E
+previousIndex(): int
+set(o: E): void
---------------
java.util.ArrayList<E>
+ArrayList()
+ArrayList(c: Collection<? extends E>)
+ArrayList(initialCapacity: int)
+trimToSize(): void
---------------
java.util.LinkedList<E>
+LinkedList()
+LinkedList(c: Collection<? extends E>)
+addFirst(element: E): void
+addLast(element: E): void
+getFirst(): E
+getLast(): E
+removeFirst(): E
+removeLast(): E
---------------
java.util.Collections (static methods)
+sort(list: List): void
+sort(list: List, c: Comparator): void
+binarySearch(list: List, key: Object): int
+binarySearch(list: List, key: Object, c: Comparator): int
+reverse(list: List): void
+reverseOrder(): Comparator
+shuffle(list: List): void
+shuffle(list: List, rmd: Random): void
+copy(des: List, src: List): void
+nCopies(n: int, o: Object): List
+fill(list: List, o: Object): void
+max(c: Collection): Object
+max(c: Collection, c: Comparator): Object
+min(c: Collection): Object
+min(c: Collection, c: Comparator): Object
+disjoint(c1: Collection, c2: Collection):boolean
+frequency(c: Collection, o: Object): int
```
List<String> list = Arrays.asList("red", "green", "blue");
Collections.sort(list);
System.out.println(list);
```
---------------
java.util.Vector<E>
+Vector()
+Vector(c: Collection<? extends E>)
+Vector(initialCapacity: int)
+Vector(initCapacity: int, capacityIncr: int)
+addElement(o: E): void
+capacity(): int 
+copyInto(anArray: Object[]): void
+elementAt(index: int): E
+elements(): Enumeration<E>
+ensureCapacity(): void
+firstElement(): E
+insertElementAt(o: E, index: int): void
+lastElement(): E
+removeAllElements(): void
+removeElement(o: Object): boolean
+removeElementAt(index: int): void
+setElementAt(o: E, index: int): void
+setSize(newSize: int): void
+trimToSize(): void
----------------
java.util.Stack<E>
+Stack() 
+empty(): boolean 
+peek(): E 
+pop(): E 
+push(o: E): E 
+search(o: Object): int
-----------
«interface» java.util.Queue<E>
+offer(element: E): boolean 
+poll(): E 
+remove(): E 
+peek(): E 
+element(): E
---------------
java.util.PriorityQueue<E>
+PriorityQueue() 
+PriorityQueue(initialCapacity: int) 
+PriorityQueue(c: Collection<? extends E>) 
+PriorityQueue(initialCapacity: int, comparator: Comparator<? super E>)
----------
