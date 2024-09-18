class Solution {
    public String largestNumber(int[] nums) {

        String []s = new String [nums.length];
        for(int i =0; i<nums.length; i++) s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a, b) -> (b+a).compareTo(a+b));
        return s[0].equals("0") ? "0" :String.join("", s);
        	
    //     String str = "";
        
    //     for(int i =0; i<nums.length; i++){
    //         char c=(char)nums[i];  
    //         str += c;
    //         System.out.println(c);

    //     }
    //    char tempArray[] = str.toCharArray();
 
    //     // Sorting temp array using
    //     Arrays.sort(tempArray);
    //     String ans = "";
    //     for(int i =tempArray.length-1; i>=0; i--){
    //         ans += tempArray[i];
    //     }
    //     System.out.println(ans);
    //     return str;
        
    }
}