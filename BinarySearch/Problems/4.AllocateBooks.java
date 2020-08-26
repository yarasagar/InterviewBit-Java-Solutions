public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int n = A.size();
        int start = 0;
        int end = 0;
        if(B > n)
            return -1;
        for(int i=0; i<n; i++)
            end = end+A.get(i);
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = (start+end)/2;
            if(isPossible(A,n,B,mid)){
                ans = Math.min(ans,mid);
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(ArrayList<Integer> A, int n, int B, int curr_min){
        int stuReq = 1;
        int curr_sum = 0;
        for(int i=0; i<n; i++){
            if(A.get(i) > curr_min)
                return false;
            if(curr_sum+A.get(i) > curr_min){
                stuReq++;
                curr_sum = A.get(i);
                if(stuReq > B)
                    return false;
            }else{
                curr_sum += A.get(i);
            }
        }
        return true;
    }
}
