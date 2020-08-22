public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int start = 0;
        int end = a.size()-1;
        int x = a.get(start);
        while(start <= end){
            int mid = (start+end)/2;
            if(a.get(start) <= a.get(end)){
                return a.get(start);
            }
            if(a.get(mid) >= a.get(start)){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return -1;
    }
}
