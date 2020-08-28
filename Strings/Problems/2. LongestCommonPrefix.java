public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder sb = new StringBuilder();
        int m = Integer.MAX_VALUE;
        for(int i=0; i<A.size(); i++){
            m = Math.min(m,A.get(i).length());
        }        
        for(int i=0; i<m; i++){
            char c = A.get(0).charAt(i);
            int j=1;
            for(; j<A.size(); j++){
                if(c != A.get(j).charAt(i)){
                    break;
                }
            }
            if(j == A.size())
                sb.append(c);
        }
        return sb.toString();
    }
}
