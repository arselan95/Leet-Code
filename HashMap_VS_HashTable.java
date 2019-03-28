
public class HashMap_VS_HashTable {

	
	/*
	 * here is many good answer already posted. I'm adding few new points and summarizing it.

HashMap and Hashtable both are used to store data in key and value form. Both are using hashing technique to store unique keys. But there are many differences between HashMap and Hashtable classes that are given below.

HashMap

HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.
HashMap allows one null key and multiple null values.
HashMap is a new class introduced in JDK 1.2.
HashMap is fast.
We can make the HashMap as synchronized by calling this code
Map m = Collections.synchronizedMap(HashMap);
HashMap is traversed by Iterator.
Iterator in HashMap is fail-fast.
HashMap inherits AbstractMap class.
Hashtable

Hashtable is synchronized. It is thread-safe and can be shared with many threads.
Hashtable doesn't allow any null key or value.
Hashtable is a legacy class.
Hashtable is slow.
Hashtable is internally synchronized and can't be unsynchronized.
Hashtable is traversed by Enumerator and Iterator.
Enumerator in Hashtable is not fail-fast.
Hashtable inherits Dictionary class.
	 */
	//******************************************************************************************************************
	/*
	 * There are several differences between HashMap and Hashtable in Java:

Hashtable is synchronized, whereas HashMap is not. This makes HashMap better for non-threaded applications, as unsynchronized Objects typically perform better than synchronized ones.

Hashtable does not allow null keys or values.  HashMap allows one null key and any number of null values.

One of HashMap's subclasses is LinkedHashMap, so in the event that you'd want predictable iteration order (which is insertion order by default), you could easily swap out the HashMap for a  LinkedHashMap. This wouldn't be as easy if you were using Hashtable.

Since synchronization is not an issue for you, I'd recommend HashMap. If synchronization becomes an issue, you may also look at ConcurrentHashMap.
	 */
}
