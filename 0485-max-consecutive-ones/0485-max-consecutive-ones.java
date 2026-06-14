class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0,maxi=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt+=1;
            }
            
            else{
                cnt=0;
            }
            maxi=Math.max(cnt,maxi);
        }
        return maxi;
    }
}