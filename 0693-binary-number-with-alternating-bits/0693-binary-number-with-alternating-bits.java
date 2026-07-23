class Solution {
    public boolean hasAlternatingBits(int n) {
        int a;
        if(((n>>0)&1)==1) a=1;
        else a=0;
        int logn2=(int)(Math.log(n)/Math.log(2));
        for(int i=0;i<logn2+1;i++){
            if(((n>>i)&1)!=a) return false;
            if(a==1)a=0;
            else a=1;
        }
        return true;
    }
}