public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) return;
        
        int[] duplicatedNums = new int[nums.length * 2];
        for (int i=0; i < nums.length; i++) {
            duplicatedNums[i] = duplicatedNums[i + nums.length] = nums[i];
        }
        
        for (int i=0; i < nums.length; i++) {
            nums[i] = duplicatedNums[i + (nums.length - k % nums.length)];
        }
    }
}
