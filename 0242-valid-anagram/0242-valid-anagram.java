class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt=new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            cnt[t.charAt(i)-'a']-=1;
        }
        for (int x : cnt) {
            if (x != 0) return false;
        }
        return true;
    }
}