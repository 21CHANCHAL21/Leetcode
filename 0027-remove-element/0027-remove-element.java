class Solution {
    public int removeElement(int[] arr, int val) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i =0; i<arr.length; i++){

            if(arr[i] != val){
                lst.add(arr[i]);
            }
        }

        for(int j =0; j<lst.size(); j++){
            arr[j] = lst.get(j);
        }
        return lst.size();
    }
}