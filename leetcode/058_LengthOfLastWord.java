public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        String[] hey = s.split(" ");
        if (hey.length == 0) return 0;
        return hey[hey.length -1].length();
    }
}
