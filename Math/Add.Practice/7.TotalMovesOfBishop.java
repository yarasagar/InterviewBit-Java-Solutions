public class Solution {
    public int solve(int A, int B) {
        int sum = 0;
        int[] arr = {-1,-1,1,1};
        int[] brr = {-1,1,-1,1};
        for(int i=0; i<4; i++){
            int C = A;
            int D = B;
            while(true){
                C = C+arr[i];
                D = D+brr[i];
                if(C >= 1 && C <= 8 && D >= 1 && D <= 8){
                    sum = sum+1;
                }else{
                    break;
                }
            }
        }
        return sum;
    }
}
