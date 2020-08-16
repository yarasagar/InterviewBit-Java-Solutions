public class Solution {
    public int isPower(int A) {
        if(A == 1)
            return 1;
        for(int i=2; i<=Math.sqrt(A); i++){
            double C = Math.log(A)/Math.log(i);
            if((C-(int)C) < 0.00000001){
                return 1;
            }
        }
        return 0;
    }
}
