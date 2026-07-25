class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        
        int[] freq = new int[totalElements + 1];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        
        int duplicate = -1;
        int missing = -1;
        
        for (int num = 1; num <= totalElements; num++) {
            if (freq[num] == 2) {
                duplicate = num;
            } else if (freq[num] == 0) {
                missing = num;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}