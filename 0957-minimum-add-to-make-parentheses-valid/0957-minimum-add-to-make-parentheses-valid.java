class Solution {
    public int minAddToMakeValid(String s) {
        // int countOpen = 0, countClose = 0;
        Stack<Character> st = new Stack<>();
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(')st.add(ch);
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.add(ch);
                }
            }
            
        }
        return st.size();
       
    }
}