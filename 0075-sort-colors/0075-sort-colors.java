class Solution {
    public void sortColors(int[] nums) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            if(nums[i] ==0){
                lst.add(0, 0);
            }

            else if(nums[i] == 2){
                lst.add(2);
            }
            else{
                l.add(1);
            }
        }
        int ind = -1;
        for(int i =0; i<lst.size(); i++){
            if(lst.get(i)==2){
                ind = i;
                break;
            }
        }
        if(ind != -1)
        lst.addAll(ind, l);

        else lst.addAll(l);
        for(int i =0; i<lst.size(); i++){
            nums[i] = lst.get(i);
        }


    }
}