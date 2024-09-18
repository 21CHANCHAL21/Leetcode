class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans = new ArrayList<>();
        String[]str1 = s1.split(" ");
        String[]str2 = s2.split(" ");

        HashSet<String> set = new HashSet<>();
        for(int i =0;i<str1.length; i++){
            set.add(str1[i]);
        }

        for(int i=0; i<str2.length; i++){
            if(!set.contains(str2[i])){
                ans.add(str2[i]);
            }
            
        }

        HashSet<String> set1 = new HashSet<>();
        for(int i =0;i<str2.length; i++){
            set1.add(str2[i]);
        }

        for(int i=0; i<str1.length; i++){
            if(!set1.contains(str1[i])){
                ans.add(str1[i]);
            }
        }
        System.out.println(ans);
        for(int i =0; i<ans.size(); i++){
            if(ans.lastIndexOf(ans.get(i)) != i){
                String s = ans.get(i);
                while(ans.contains(s))
                ans.remove(s);
                i--;
            }
        }
        String a[] = new String[ans.size()];
        for(int i =0; i<ans.size(); i++){
            a[i] = ans.get(i);
        }

        return a;
    }
}