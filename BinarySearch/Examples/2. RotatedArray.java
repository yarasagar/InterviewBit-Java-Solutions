public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int x = Integer.MAX_VALUE;
        for(int i=0; i<a.size(); i++){
            if(x > a.get(i))
                x = a.get(i);
        }
        return x;
    }
}
