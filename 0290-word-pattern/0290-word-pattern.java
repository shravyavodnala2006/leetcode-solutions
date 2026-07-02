class Solution {
    public boolean wordPattern(String pattern, String s) {
          String[] parts = s.split(" ");
        if (parts.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rev = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch) && !rev.containsKey(parts[i])) {
                map.put(ch, parts[i]);
                rev.put(parts[i], ch);
            } else {
                if (!parts[i].equals(map.get(ch)) || ch != rev.get(parts[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}