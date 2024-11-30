class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];

        for(int i =0; i< n; i++){
            for(int j = 0; j<m; j++){
                ans[i][j] = matrix[i][j];
            }
        }
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    int row = i;
                    for(int col = 0; col<m; col++){
                        ans[row][col] = 0;
                        
                    }
                    int c = j;
                    for(int r = 0; r<n; r++){
                        ans[r][c] = 0;
                    }
                }
                
            }
        }

        for(int i =0; i< n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = ans[i][j];
            }
        }

        
    }
}