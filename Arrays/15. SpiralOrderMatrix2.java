public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int stRow = 0;
        int stCol = 0;
        int endRow = A-1;
        int endCol = A-1;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for(int i=0; i<A; i++){
            ArrayList<Integer> C = new ArrayList<>();
            for(int j=0; j<A; j++){
                C.add(0);
            }
            B.add(C);
        }
        int x = 1;
        while(stRow <= endRow && stCol <= endCol){
            for(int i=stCol; i<=endCol; i++){
                B.get(stRow).set(i,x);
                x++;
            }
            stRow++;
            for(int i=stRow; i<=endRow; i++){
                B.get(i).set(endCol,x);
                x++;
            }
            endCol--;
            if(stCol <= endCol){
                for(int i=endCol; i>=stCol; i--){
                    B.get(endRow).set(i,x);
                    x++;
                }
                endRow--;
            }
            if(stRow <= endRow){
                for(int i=endRow; i>=stRow; i--){
                    B.get(i).set(stCol,x);
                    x++;
                }
                stCol++;
            }
        }
        return B;
    }
}
