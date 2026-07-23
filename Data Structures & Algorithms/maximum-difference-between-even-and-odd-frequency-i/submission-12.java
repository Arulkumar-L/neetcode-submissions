class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[256];
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        
        int maxOdd = 0;                    
        int minEven = Integer.MAX_VALUE;   
        
        for (int i = 'a'; i <= 'z'; i++) {
            int count = freq[i];
            
            if (count == 0) {
                continue;
            }
            
            if (count % 2 != 0) {
                maxOdd = Math.max(maxOdd, count);
            } else {
                minEven = Math.min(minEven, count);
            }
        }
        
        return maxOdd - minEven;
    }
}