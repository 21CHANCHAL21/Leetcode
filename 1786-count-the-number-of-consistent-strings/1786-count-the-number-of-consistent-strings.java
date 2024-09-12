class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();

        for(int i =0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        int ans = 0;
        for(int i =0; i<words.length; i++){
            String word = words[i];
            boolean res = true;
            for(int j =0; j<word.length(); j++){
                if(!set.contains(word.charAt(j))){
                    res = false;
                    break;
                }
            }
            if(res)ans++;
        }
        return ans;
    }
}