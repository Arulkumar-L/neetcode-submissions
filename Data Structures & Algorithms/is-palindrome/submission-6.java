class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='0' && s.charAt(i)<='9')){
                str+=s.charAt(i);
            }
        }
        String ns=str.toLowerCase();
        char arr[] = ns.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
