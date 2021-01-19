/*
In a string s of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".

A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. In the above example, "xxxx" has the interval [3,6].

A group is considered large if it has 3 or more characters.

Return the intervals of every large group sorted in increasing order by start index.


Example: 

Input: s = "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
Explanation: The large groups are "ddd", "eeee", and "bbb".
*/

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        
        List<List<Integer>> answer= new ArrayList<List<Integer>>();
        List<Integer> range;
        
        
        int i=0;
        int j=0; 
        
       //iterate through string
        while(j < s.length()-1)
        {
           //if next char is not equal increment j and bring i to j 
            if(s.charAt(i)!=s.charAt(i+1) || s.charAt(j) != s.charAt (j+1))
            {
                if((j-i) >= 2)
                {  
                    range = new ArrayList<Integer>();
                    range.add(i);
                    range.add(j);
                    answer.add(range);
                }
                j++;
                i=j;
            }
        
            // if equal then just increment j 
            else if(s.charAt(j) == s.charAt (j+1))
            {
                //corner case if there is sequence in ending  
                if(j == s.length()-2 && (j-i) >= 1)
                {        
                    range = new ArrayList<Integer>();
                    range.add(i);
                    range.add(j+1);
                    answer.add(range);
                }
                j++;
            }     
        }
        return answer;
}
    
}