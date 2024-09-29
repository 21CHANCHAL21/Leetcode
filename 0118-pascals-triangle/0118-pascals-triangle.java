class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (num == 0) return ans;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        
        for (int i = 1; i < num; i++) {
            List<Integer> prevRow = ans.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    currentRow.add(1);
                    continue;
                }
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // currentRow.add(1);
            ans.add(currentRow);
        }
        
        return ans;
    }
}
