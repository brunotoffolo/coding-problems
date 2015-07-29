public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] > nums[right]) {
                left++;
                while (left < right && left < nums.length && nums[left] == nums[left+1])
                    left++;
            } else {
                right--;
                while (left < right && right> 0 && nums[right] == nums[right-1])
                    right--;
            }
        }
        return nums[left];
    }
}
