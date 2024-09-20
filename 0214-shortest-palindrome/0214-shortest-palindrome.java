// class Solution {
//     public String shortestPalindrome(String s) {
//         StringBuilder str = new StringBuilder();
//         str.append(s);
//         int i =0, j = s.length()-1;
//         int k =0;
//         if(s.length()==0)return "";
//         while(i<j){
//             if(s.charAt(i)  != s.charAt(j)){
//                 String sp  = ""+s.charAt(j);
//                 str.insert(k, sp);
//                 j--; 
//                 k++;    
//             }
//             else{
//                 j--;
//                 i++;
//             } 
//         }
        
//         if(str.charAt(0) != str.charAt(str.length()-1))
//         str.insert(0, str.charAt(str.length()-1));
//         return str.toString();
        
//     }
// }

class Solution {
    public String shortestPalindrome(String s) {
        int count = kmp(new StringBuilder(s).reverse().toString(), s);
        return new StringBuilder(s.substring(count)).reverse().toString() + s;
    }

    private int kmp(String txt, String patt) {
        String newString = patt + '#' + txt;
        int[] pi = new int[newString.length()];
        int i = 1, k = 0;
        while (i < newString.length()) {
            if (newString.charAt(i) == newString.charAt(k)) {
                k++;
                pi[i] = k;
                i++;
            } else {
                if (k > 0) {
                    k = pi[k - 1];
                } else {
                    pi[i] = 0;
                    i++;
                }
            }
        }
        return pi[newString.length() - 1];
    }
}