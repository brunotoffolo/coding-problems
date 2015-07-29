public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int num=0; num < nums.length; num++) {
            if (map.containsKey(nums[num])) {
                List<Integer> list = map.get(nums[num]);
                for (int n : list) {
                    if (num - n <= k) return true;
                }
                list.add(num);
            } else {
                List<Integer> list = new LinkedList<Integer>();
                list.add(num);
                map.put(nums[num], list);
            }
        }
        return false;
    }
}
