// class Solution {
//     public int getWinner(int[] arr, int k) {
//         int n = arr.length;
//         int win_count = 0;
//         int temp = 0;
//         int s = 0;
//         int start = arr[0];
//         while(win_count != k  && arr[1] != start){

//             if(arr[0]> arr[1]){
//                 win_count ++;
//                 s = arr[1];   
//             }
//             else{
//                 s = arr[0];
//                 win_count = 1;
//                 arr[0] = arr[1];
    
//             }
//             temp = s;
//             for(int i = 2; i<n; i++){
//                 arr[i-1] = arr[i];
//             }
//             arr[n-1] = temp;

//         }
//         return arr[0];  
//     }
// }


public class Solution {
    public int getWinner(int[] arr, int k) {
        if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }
        if (k >= arr.length) {
            return Arrays.stream(arr).max().getAsInt();
        }

        int current_winner = arr[0];
        int consecutive_wins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (current_winner > arr[i]) {
                consecutive_wins++;
            } else {
                current_winner = arr[i];
                consecutive_wins = 1;
            }

            if (consecutive_wins == k) {
                return current_winner;
            }
        }

        return current_winner;
    }
}