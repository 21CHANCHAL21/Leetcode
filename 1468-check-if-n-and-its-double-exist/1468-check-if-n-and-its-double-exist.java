class Solution {
    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< arr.length; i++){
            set.add(arr[i]);
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] == arr[j])return true;
                }
                
            }
            else{
                if(set.contains(arr[i]*2))return true;
            }
        }

        return false;
        
    }
}