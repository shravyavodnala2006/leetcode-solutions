class Solution {
    public int lengthOfLongestSubstring(String s) {        
        int n=s.length();
        int len=0;
        int l=0;
        int r=0;      
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n && l<n){
            char ch=s.charAt(r); 
            if(map.containsKey(ch)){
                if(map.get(ch)>=l){
                    l=map.get(ch)+1;
                }                            
            }
            map.put(ch,r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}