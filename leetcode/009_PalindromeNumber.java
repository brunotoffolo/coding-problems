public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        
        List<Integer> list = new ArrayList<Integer>();
        
        int val;
        while (x > 0) {
            val = x % 10;
            x = x / 10;
            list.add(val);
        }
        
        int size = list.size();
        int half = size/2;
        
        for (int i = 0; i < half; i++)
            if (list.get(i) != list.get(size - i - 1))
                return false;
        
        return true;
    }
}
