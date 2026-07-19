class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n ; i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(words[j].contains(words[i])){
                    System.out.println(i +" " + j);
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}