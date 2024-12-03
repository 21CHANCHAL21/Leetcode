// class Solution {
//     public String addSpaces(String s, int[] spaces) {
//         // int i = 0;
//         String str = "";
//         int j = 0;
//         for(int i =0; i<= spaces.length; i++){
//             if(i == spaces.length){
//             str += s.substring(j);
//             break;
//             }
//             str += s.substring(j, spaces[i])+ " ";
           
//             j = spaces[i];
//         }

//         return str;
//     }
// }

class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();

        sb.append(s.substring(0,spaces[0]));
        int i=1;
        for(; i<spaces.length; i++){
            sb.append(" ");
            sb.append(s.substring(spaces[i-1],spaces[i]));            
        }
        sb.append(" ");
        sb.append(s.substring(spaces[i-1])); 

        return sb.toString();
    }
}