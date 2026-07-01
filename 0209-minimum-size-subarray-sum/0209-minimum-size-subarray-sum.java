class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,minlen=Integer.MAX_VALUE,sum=0;
        int n=nums.length;
        for(r=0;r<n;r++){
            sum+=nums[r];
            while (sum>=target){
                minlen=Math.min(minlen, r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}