package hashTable;

/*
 * Scenario I - Provide More Information
The first scenario to use a hash map is that we need more information rather than only the key. 
Then we can build a mapping relationship between key and information by hash map.

 

An Example
Let's look at an example:

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

In this example, if we only want to return true if there is a solution, 
we can use a hash set to store all the values when we iterate the array and check if target - current_value is 
in the hash set or not.

However, we are asked to return more information which means we not only care about the value but
also care about the index. We need to store not only the number as the key but also the index as the value. 
Therefore, we should use a hash map rather than a hash set.

What's More
In some cases, we need more information not just to return more information but also to help us with our decisions.

In the previous examples, when we meet a duplicated key, we will return the corresponding information
 immediately. But sometimes, we might want to check if the value of the key is acceptable first.
 */


public class PracticalHashMap {
	/*
	 * Template for using hash map to find duplicates. 
	 * Replace ReturnType with the
	 * actual type of your return value.
	 */
	/*
	 * ReturnType aggregateByKey_hashmap(List<Type>& keys) {
    // Replace Type and InfoType with actual type of your key and value
    Map<Type, InfoType> hashmap = new HashMap<>();
    for (Type key : keys) {
        if (hashmap.containsKey(key)) {
            if (hashmap.get(key) satisfies the requirement) {
                return needed_information;
            }
        }
        // Value can be any information you needed (e.g. index)
        hashmap.put(key, value);    
    }
    return needed_information;
}
	 */
	
	//****SENARIO 2*******************************************************
	/*
	 * Template for using hash map to find duplicates.
	 * Replace ReturnType with the actual type of your return value.
	 */
	/*
	ReturnType aggregateByKey_hashmap(List<Type>& keys) {
	    // Replace Type and InfoType with actual type of your key and value
	    Map<Type, InfoType> hashmap = new HashMap<>();
	    for (Type key : keys) {
	        if (hashmap.containsKey(key)) {
	            hashmap.put(key, updated_information);
	        }
	        // Value can be any information you needed (e.g. index)
	        hashmap.put(key, value);    
	    }
	    return needed_information;
	}

}

*/
}

//SENARIO 2
/*
 *Another frequent scenario is to aggregate all the information by key. We can also use a hash map to achieve this goal.

 

An Example
Here is an example:

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

A simple way to solve this problem is to count the occurrence of each character first. 
And then go through the results to find out the first unique character.

Therefore, we can maintain a hashmap whose key is the character while the value is a counter for 
the corresponding character. Each time when we iterate a character, we just add the corresponding value by 1.

 

What's more
The key to solving this kind of problem is to decide your strategy when you encounter an existing key.

In the example above, our strategy is to count the occurrence. Sometimes, we might sum all the 
values up. And sometimes, we might replace the original value with the newest one. The strategy depends on the 
problem and practice will help you make a right decision. 
 * 
 */
