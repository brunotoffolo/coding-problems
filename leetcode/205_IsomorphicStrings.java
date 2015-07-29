public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            if (map.containsKey(schar)) {
                sb.append(map.get(schar));
            } else {
                char tchar = t.charAt(i);
                if (map.containsValue(tchar)) return false;
                map.put(schar, tchar);
                sb.append(tchar);
            }
        }
        
        return t.equals(sb.toString());
    }
}
