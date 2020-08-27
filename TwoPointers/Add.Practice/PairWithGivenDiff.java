public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(i!=j && A.get(j)-A.get(i) == B){
                return 1;
            }else if(A.get(j)-A.get(i) < B){
                j++;
            }else{
                i++;
            }
        }
        return 0;
    }
}
