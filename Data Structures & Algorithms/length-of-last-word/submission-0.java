class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int n=str.length();
        System.out.println(str);
        int count=0;
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch!=' '){
                count++;
            }
            if(ch==' '){
                break;
            }
        }
        return count;
    }
}