«interface» java.util.Map<K,V>
+clear(): void
+containsKey(key: Object): boolean
+containsValue(value: Object): boolean
+entrySet(): Set<Map.Entry<K,V>>
+get(key: Object): V
+isEmpty(): boolean
+keySet(): Set<K>
+put(key: K, value: V): V
+putAll(m: Map<? extends K,? extends V>): void
+remove(key: Object): V
+size(): int
+values(): Collection<V>
+forEach(action: Consumer<? super K, ? super V): default void
---
«interface» java.util.Map.Entry<K,V>
+getKey(): K 
+getValue(): V 
+setValue(value: V): void
---
Map<K,V>->AbstractMap<K,V>->HashMap<K,V>
Map<K,V>->AbstractMap<K,V>->HashMap<K,V>->LinkedHashMap<K,V>
Map<K,V>->AbstractMap<K,V>->TreeMap<K,V>(implements SortedMap<K,V>,NavigableMap<K, V>)
---
java.util.HashMap<K,V>
+HashMap()
+HashMap(initialCapacity: int,loadFactor: float)
+HashMap(m: Map<? extends K, ? extends V>)
---
java.util.LinkedHashMap<K,V>
+LinkedHashMap()
+LinkedHashMap(m: Map<? extends K,? extends V>)
+LinkedHashMap(initialCapacity: int,
loadFactor: float, accessOrder: boolean)
---
java.util.TreeMap<K,V>
+TreeMap()
+TreeMap(m: Map<? extends K,? extends V>)
+TreeMap(c: Comparator<? super K>)
---
«interface» java.util.SortedMap<K,V>
+firstKey(): K
+lastKey(): K
+comparator(): Comparator<? super K>)
+headMap(toKey: K): SortedMap<K,V>
+tailMap(fromKey: K): SortedMap<K,V>
---
«interface» java.util.NavigableMap<K, V>
+floorKey(key: K): K
+ceilingKey(key: K): K
+lowerKey(key: K): K
+higherKey(key: K): K
+pollFirstEntry(): Map.EntrySet<K, V>
+pollLastEntry(): Map.EntrySet<K, V>