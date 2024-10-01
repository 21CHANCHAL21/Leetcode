class Solution {
    public boolean canArrange(int[] arr, int k) {

        int []freq = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem <0){
                rem = rem +k;
            }
            freq[rem]++;
        }

        if(freq[0] % 2 !=0){
            return false;
        }

        for(int i =1; i<=k/2; i++){
            if(freq[i] != freq[k-i]){
                return false;
            }
        }

        return true;
        // int count = 0;
        // int n = arr.length;
        // int i =0, j = arr.length-1;
        // while(i<j){
        //     if((arr[i] + arr[j]) % k == 0){
        //         count++;
        //     }
        //     i++;
        //     j--;
        // }

        // return count >= n/2 ;
        
        
        
    }
}