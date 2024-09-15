class Solution {
    public int findTheLongestSubstring(String s) {
        int []mapy = new int[32];
        Arrays.fill(mapy, -2);
        mapy[0] = -1;

        int maxLen = 0;
        int mast = 0;

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            switch(ch){
                case 'a': mast ^= 1;
                break;

                case 'e': mast ^= 2;
                break;

                case 'i': mast ^= 4;
                break;
                case 'o': mast ^= 8;
                break;

                case 'u': mast ^= 16;
                break;
            }

            int prev = mapy[mast];
            if(prev == -2){
                mapy[mast] =i;
            }
            else{
                maxLen = Math.max(maxLen, i-prev);
            }
        }

        return maxLen;
        
    }
}