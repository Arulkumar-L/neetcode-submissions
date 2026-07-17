class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean flag = true;
        int i=0,j=0,count=0;
        int n1=t.length();
        int n2=s.length();
        while(i<n1 && j<n2){
            char ch1=t.charAt(i);
            char ch2=s.charAt(j);
            if(ch2==ch1){
                j++;
            }
            i++;
        }
        if(j<n2){
            return false;
        }
        return flag;
    }
}