class Solution {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
         }
        int num=x;
        int dup=0;
        while(x>0){
            int ld=x%10;
            dup=dup*10+ld;
            x=x/10;
        }
        if(num==dup){
            return true;
        }
        else{
            return false;
        }
    }
}