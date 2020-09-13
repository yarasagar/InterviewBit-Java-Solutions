public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int j=0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) <= 0){
                int temp = A.get(i);
                A.set(i,A.get(j));
                A.set(j,temp);
                j++;
            }
        }
        int n = A.size()-j;
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=j; i<A.size(); i++){
            B.add(A.get(i));
        }
        return firstMissing(B);
    }
    public int firstMissing(ArrayList<Integer> B){
        int n = B.size();
        for(int i=0; i<n; i++){
            int x = Math.abs(B.get(i));
            if(x <= n && B.get(x-1) > 0){
                B.set(x-1,-1*B.get(x-1));
            }
        }
        for(int i=0; i<n; i++){
            if(B.get(i) > 0)
                return i+1;
        }
        return n+1;
    }
}
