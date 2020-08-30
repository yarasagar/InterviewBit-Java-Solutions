public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int i=0;
        int j=B.length();
        while(j <= A.length()){
            if(A.substring(i,j).equals(B)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}
