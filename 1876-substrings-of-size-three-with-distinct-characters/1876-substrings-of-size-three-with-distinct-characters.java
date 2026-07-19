class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int k=3;
        int cnt=0;       
        for(int i=0;i<=n-k;i++){
            boolean dist=true;
            HashSet<Character>st=new HashSet<>();
            for(int j=i;j<=i+k-1;j++){
                char ch=s.charAt(j);
                if(!st.contains(ch)) st.add(ch);
                else dist=false; 
            }
            if(dist) cnt++;
        }
        return cnt;
    }
}