class Solution {
    public boolean isPalindrome(int x) {
        if(x <0)return false;
        int num = x;
        int newN = 0;
        while(x!= 0){
            int d = x%10;
            newN = newN *10 +d;
            x = x/10;
        }
        return newN == num;
        
    }
}