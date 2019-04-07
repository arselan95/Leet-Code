class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
    
        List<Integer> set = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
        */
         //METHOD 2
        /*
        List<Integer> set = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
        */
        
        //METHOD 3
         List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    for(int num : nums1) 
        /*
        	getOrDefault(Object key, V defaultValue)
Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        */
        map.put(num,map.getOrDefault(num,0) + 1);
    
        for(int num : nums2){
        if(map.containsKey(num)){
            list.add(num);
           if(map.get(num) == 1) 
           {
               map.remove(num);
           }
           else 
           {
               map.put(num,map.get(num)-1);
           }
        }
    }
    int[] res = new int[list.size()];
    for(int i = 0; i < list.size(); i++) res[i] = list.get(i);
    return res;
        
    }
}
