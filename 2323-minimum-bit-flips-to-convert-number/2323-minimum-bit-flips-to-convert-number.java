class Solution {
    public int minBitFlips(int start, int goal) {
       
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
        int i = s.length()-1, j =g.length()-1;
        int ans = 0;
        while(i>=0 && j>=0){
            if(s.charAt(i) != g.charAt(j))ans++;
            i--;
            j--;
        }
        while(i>=0){
            if(s.charAt(i) == '1')ans++;
            i--;
        }

        while(j>=0){
            if(g.charAt(j) == '1')ans++;
            j--;
        }

        return ans;
        
    }
}