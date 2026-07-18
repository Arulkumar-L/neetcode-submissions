class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String str=details[i];
            char ch1=str.charAt(11);
            char ch2=str.charAt(12);
            String s=""+ch1+ch2;
            if(Integer.valueOf(s) > 60){
                count++;
            }
        }
        return count;
    }
}