public class Solution {
    public int singleNumber_HashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, 2);
            else map.put(num, 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) return num;
        }
        return Integer.MIN_VALUE;
    }
    
    public int singleNumber_BitManipulation(int[] nums) {
        int single = 0;
        for (int num : nums)
            single = single ^ num;
        return single;
    }
}
