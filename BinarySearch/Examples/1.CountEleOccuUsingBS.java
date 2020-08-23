public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B) {
        if(finFirstOrLastEle(A,B,false) == -1 && finFirstOrLastEle(A,B,true) == -1)
            return 0;
        return finFirstOrLastEle(A,B,false)-finFirstOrLastEle(A,B,true)+1;
    }
    public int finFirstOrLastEle(List<Integer> A, int B, boolean isFirst){
        int start = 0;
        int end = A.size()-1;
        int res = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(A.get(mid) == B){
                res = mid;
                if(isFirst)
                    end = mid-1;
                else
                    start = mid+1;
            }else if(A.get(mid) < B){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;
    }
}
