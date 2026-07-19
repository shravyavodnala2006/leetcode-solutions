class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int k=3;
        int cnt=0;
        int l=0;
        int r=0;      
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n){
            char ch=s.charAt(r); 
            map.put(ch,map.getOrDefault(ch,0)+1);              
            if(r-l==k){
                char left=s.charAt(l);
                map.put(left,map.getOrDefault(left,0)-1);
                if (map.get(left) == 0) 
                    map.remove(left);
                l++;
                             
            }
            if(r-l+1==k){
                if(map.size()==k) cnt++;
            }
            r++;
        }
        return cnt;
    }
}