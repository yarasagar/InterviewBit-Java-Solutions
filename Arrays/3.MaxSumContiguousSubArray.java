public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int currSum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            currSum = Math.max(currSum,0);
            currSum = currSum+A.get(i);
            ans = Math.max(ans,currSum);
        }
        return ans;
    }
}
