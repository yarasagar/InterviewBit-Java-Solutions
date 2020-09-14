public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        for(int i=0; i<n-1; i=i+2){
            swap(i,i+1,A);
        }
        return A;
    }
    public void swap(int x, int y, ArrayList<Integer> A){
        int t = A.get(x);
        A.set(x, A.get(y));
        A.set(y, t);
    }
}
