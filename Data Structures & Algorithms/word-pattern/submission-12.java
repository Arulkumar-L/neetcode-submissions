class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String str[] = s.split(" ");
        System.out.print(pattern.length() +  " " + str.length);
        if(pattern.length()==str.length){
            for(int i=0;i<pattern.length();i++){
                char ch = pattern.charAt(i);
                if(!map.containsKey(ch) && !map.containsValue(str[i])){
                    map.put(ch,str[i]);
                }
            }
        }
        Collection<String> vals = map.values();
            System.out.print(vals+" ");

        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<str.length;i++){
            String str1=map.get(pattern.charAt(i));
            if(!str[i].equals(str1)){
                return false;
            }
        }
        return true;
    }
}