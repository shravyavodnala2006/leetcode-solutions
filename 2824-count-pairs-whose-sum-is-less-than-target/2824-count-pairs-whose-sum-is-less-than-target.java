class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int cnt=0;        
        int p1=0;      
        while(p1<n-1){
            int p2=p1+1;
            while(p2<n){
            int sum=nums.get(p1)+nums.get(p2);
            if(sum<target) cnt++;
            p2++;
            }          
            p1++;
        }
        return cnt;
    }
}