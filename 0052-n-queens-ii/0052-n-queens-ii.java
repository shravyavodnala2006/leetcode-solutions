class Solution {
    static int cnt;
    public int totalNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]ch=new char[n][n];
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n;j++){
            ch[i][j] = '.';
            }
        }
        boolean[]takencol=new boolean[n];
        cnt=0;
        nqueens(n,ans,ch,takencol,0);
        return cnt;
    }
    static void nqueens(int n,List<List<String>>ans,char[][]ch,boolean[]takencol,int row){
        if(row==n){
            List<String>list=new ArrayList<>();
            for (int i = 0; i < ch.length; i++) {
                list.add(new String(ch[i]));
            }
            ans.add(list);
            cnt++;
            return;
        }
        for(int j=0;j<n;j++){
           if(takencol[j]==false && !isDiag(row,j,ch,n)){
               ch[row][j]='Q';
               takencol[j]=true;
               nqueens(n,ans,ch,takencol,row+1);
               ch[row][j]='.';
               takencol[j]=false;
           }
        }
    }
    static boolean isDiag(int r,int c,char[][]ch,int n){
        int i=r;
        int j=c;
        while(i>0 &&j>0){
            i--;
            j--;
            if(ch[i][j]=='Q') return true;
        }
        i=r;
        j=c;
        while(i>0 &&j<n-1){
            i--;
            j++;
            if(ch[i][j]=='Q') return true;
        }
        return false;
    }
}