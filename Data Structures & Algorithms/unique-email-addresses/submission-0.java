class Solution {
    HashSet<String> set = new HashSet<>();
    public void function(String email){
        int n=email.lastIndexOf('@');
        String str="";
        for(int i=0;i<n;i++){
            char ch=email.charAt(i);
            if(ch!='.'){
                str=str+ch;
            }if(ch=='+'){
                break;
            }
        }
        for(int i=n;i<email.length()-1;i++){
            char ch=email.charAt(i);
            str=str+ch;
        }
        set.add(str);
    }
    public int numUniqueEmails(String[] emails) {
        for(int i=0;i<emails.length;i++){
            function(emails[i]);
        }
        // for(int i=0;i<set.size();i++){
        //     System.out.println(set.get(i));
        // }
        List<String> list = new ArrayList<String>(set);
        System.out.print(list);
        return set.size();
    }
}