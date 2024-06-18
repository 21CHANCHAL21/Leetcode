class Solution {
     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDifficulty = 0;
        for (int d : difficulty) {
            maxDifficulty = Math.max(maxDifficulty, d);
        }

        int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);
        }

        for (int i = 1; i <= maxDifficulty; i++) {
            maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);
        }

        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > maxDifficulty) {
                totalProfit += maxProfitUpToDifficulty[maxDifficulty];
            } else {
                totalProfit += maxProfitUpToDifficulty[ability];
            }
        }

        return totalProfit;
    }
    // public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    //     ArrayList<Integer> lst = new ArrayList<>();

    //     for(int i =0; i<difficulty.length; i++){
    //         lst.add(difficulty[i]);
    //     }
    //     int maxProfit = 0;
    //     for(int i =0; i<worker.length; i++){
    //         if(lst.contains(worker[i])){
    //             int ind = lst.indexOf(worker[i]);
    //             maxProfit += profit[ind];
    //         }
    //         else{
    //             int j =0;
    //             while(j<difficulty.length && worker[i] >= difficulty[j]){
    //                 j++;

    //             }
    //             if(j != 0)
    //             maxProfit += profit[j-1];
    //         }
    //     }
    //     return maxProfit;
    // }
}