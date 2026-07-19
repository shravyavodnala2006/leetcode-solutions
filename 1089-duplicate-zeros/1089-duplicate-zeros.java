class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        int p1=0;
       
        while(p1<n){
            if(arr[p1]==0){
                list.add(0);
                list.add(0);
            }
            else list.add(arr[p1]);
            arr[p1]=list.get(p1);
            p1++;
        }
    }
}