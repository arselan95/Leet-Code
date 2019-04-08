package hashTable;

public class AboutHashTable {

	/*
	 * Hash Table is a data structure which organizes data using hash functions in
	 * order to support quick insertion and search.
	 * 
	 * There are two different kinds of hash tables: hash set and hash map.
	 * 
	 * The hash set is one of the implementations of a set data structure to store
	 * no repeated values.
	 * 
	 * The hash map is one of the implementations of a map data structure to store
	 * (key, value) pairs.
	 * 
	 * It is easy to use a hash table with the help of standard template libraries.
	 * 
	 * Most common languages such as Java, C++ and Python support both hash set and
	 * hash map.
	 * 
	 * By choosing a proper hash function, the hash table can achieve wonderful
	 * performance in both insertion and search.
	 * 
	 * 
	 * In this card, we will answer the following questions:
	 * 
	 * What is the principle of a hash table? How to design a hash table? How to use
	 * hash set to solve duplicates related problems? How to use hash map to
	 * aggregate information by key? How to design a proper key when using a hash
	 * table? And we also provide exercises for you to be familiar with hash table.
	 */
	// **********************************************************************************************************************

	// COMPLEXITY
	/*
	 * If there are M keys in total, we can achieve the space complexity of O(M)
	 * easily when using a hash table.
	 * 
	 * However, you might have noticed that the time complexity of hash table has a
	 * strong relationship with the design.
	 * 
	 * Most of us might have used an array in each bucket to store values in the
	 * same bucket. Ideally, the bucket size is small enough to be regarded as a
	 * constant. The time complexity of both insertion and search will be O(1).
	 * 
	 * But in the worst case, the maximum bucket size will be N. And the time
	 * complexity will be O(1) for insertion but O(N) for search.
	 */
}
