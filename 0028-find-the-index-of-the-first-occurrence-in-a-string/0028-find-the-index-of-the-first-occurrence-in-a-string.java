class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder();
        str.append(haystack);

        return str.indexOf(needle);
    }
}