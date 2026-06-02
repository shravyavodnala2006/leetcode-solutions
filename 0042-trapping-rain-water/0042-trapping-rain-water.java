class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pm[]=new int[n];
        int sm[]=new int[n];
        pm[0]=height[0];
        sm[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            pm[i]=Math.max(pm[i-1],height[i]);
            sm[n-i-1]=Math.max(sm[n-i],height[n-i-1]);
        }
        int sum=0;
        int mini;
        for(int i=0;i<n;i++){
            mini=Math.min(pm[i],sm[i]);
            sum+=mini-height[i];
        }
        return sum;
    }
}