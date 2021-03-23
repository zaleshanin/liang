21.7 Singleton and Unmodifiable Collections and Maps
java.util.Collections
+singleton(o: Object): Set Returns an immutable set containing the specified object.
+singletonList(o: Object): List Returns an immutable list containing the specified object.
+singletonMap(key: Object, value: Object): Map Returns an immutable map with the key and value pair.
+unmodifiableCollection(c: Collection): Collection Returns a read-only view of the collection.
+unmodifiableList(list: List): List Returns a read-only view of the list.
+unmodifiableMap(m: Map): Map Returns a read-only view of the map.
+unmodifiableSet(s: Set): Set Returns a read-only view of the set.
+unmodifiableSortedMap(s: SortedMap): SortedMap Returns a read-only view of the sorted map.
+unmodifiableSortedSet(s: SortedSet): SortedSet Returns a read-only view of the sorted set.
---
The Collections class defines three constants— EMPTY_SET , EMPTY_LIST , and
EMPTY_MAP —for an empty set, an empty list, and an empty map. These collections are immu-
table. The class also provides the singleton(Object o) method for creating an immutable
set containing only a single item, the singletonList(Object o) method for creating an
immutable list containing only a single item, and the singletonMap(Object key, Object
value) method for creating an immutable map containing only a single entry.
The Collections class also provides six static methods for returning read-only views for
collections: unmodifiableCollection(Collection c) , unmodifiableList(List
list) , unmodifiableMap(Map m) , unmodifiableSet(Set set) , unmodifiableSor
tedMap(SortedMap m) , and unmodifiableSortedSet(SortedSet s) . This type of
view is like a reference to the actual collection. However, you cannot modify the collection
through a read-only view. Attempting to modify a collection through a read-only view will
cause an UnsupportedOperationException .