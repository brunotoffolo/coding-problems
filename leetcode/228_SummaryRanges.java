c class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> solution = new LinkedList<String>();
        if (nums == null || nums.length == 0) {
            return solution;
        }
        
        int startRange = nums[0];
        int endRange = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > endRange + 1) {
                if (startRange == endRange) solution.add("" + endRange);
                else solution.add(startRange + "->" + endRange);
                
                startRange = endRange = nums[i];
            } else {
                endRange = nums[i];
            }
        }
        
        if (startRange == endRange) solution.add("" + endRange);
        else solution.add(startRange + "->" + endRange);
        
        return solution;
    }
}
