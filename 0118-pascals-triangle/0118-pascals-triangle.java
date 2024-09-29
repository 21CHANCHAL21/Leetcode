class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (num == 0) return ans;
        
        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        
        for (int i = 1; i < num; i++) {
            List<Integer> prevRow = ans.get(i - 1); // Get the previous row
            List<Integer> currentRow = new ArrayList<>();
            
            // First element is always 1
            currentRow.add(1);
            
            // Fill the middle elements
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element is always 1
            currentRow.add(1);
            
            // Add the current row to the answer
            ans.add(currentRow);
        }
        
        return ans;
    }
}
