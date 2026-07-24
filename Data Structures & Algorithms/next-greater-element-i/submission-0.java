class Solution {
    public int fun(int[] arr, int j){
        int n = arr.length;
        int k = arr[j];
        for(;j<n;j++){
            if(arr[j]>k){
                return arr[j];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums2.length;
        for(int i=0;i<n;i++){
            map.put(nums2[i],i);
        }
        int arr[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=fun(nums2,map.get(nums1[i]));
        }
        return arr;
    }
}