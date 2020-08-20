public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        int N = A.size();
        for (int col = 0; col < N; col++) { 
            ArrayList<Integer> C = new ArrayList<>();
            int startcol = col, startrow = 0; 
            while (startcol >= 0 && startrow < N) { 
                C.add(A.get(startrow).get(startcol));
                startcol--; 
                startrow++; 
            }
            B.add(C);
        } 
        // For each row start column is N-1 
        for (int row = 1; row < N; row++) { 
            ArrayList<Integer> C = new ArrayList<>();
            int startrow = row, startcol = N - 1; 
            while (startrow < N && startcol >= 0) { 
                C.add(A.get(startrow).get(startcol));
                startcol--; 
                startrow++; 
            } 
            B.add(C);
        }
        return B;
    }
}
