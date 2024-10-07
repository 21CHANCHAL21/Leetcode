class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s);

        while(true){
            int ind1 = str.indexOf("AB");
            int ind2 = str.indexOf("CD");
            System.out.println(ind1 + " "+ ind2 +" "+ str.length());
            if(ind1 == -1 && ind2 == -1)return str.length();
            if(ind1 != -1){
                str.delete(ind1,ind1+2);
                continue;
            } 
            if(ind2 != -1)str.delete(ind2, ind2+2);
        }

        // return str.length();
    }
}