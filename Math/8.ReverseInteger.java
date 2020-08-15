public class Solution {
    public int reverse(int A) {
        int k = 1;
        if(A<0){
            k=-1;
            A = k*A;
        }
        int x = 0;
        int prevx = 0;
        while(A != 0){
            int B = A%10;
            x = x*10+B;
            if((x-B)/10 != prevx)
                return 0;
            prevx = x;
            A = A/10;
        }
        return x*k;
    }
}
