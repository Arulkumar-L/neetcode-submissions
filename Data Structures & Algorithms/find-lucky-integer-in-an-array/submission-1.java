class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int freq[] = new int[256];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int result=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==freq[arr[i]]){
                result=Math.max(arr[i],result);
            }
        }
        return result;
    }
}