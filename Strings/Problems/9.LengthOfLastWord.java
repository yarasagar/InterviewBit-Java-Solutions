public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int c=0;
        int prevC = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == ' '){
                if(c != 0)
                    prevC = c;
                c = 0;
            }else{
                c++;
            }
        }
        return (c == 0? prevC : c);
    }
}
