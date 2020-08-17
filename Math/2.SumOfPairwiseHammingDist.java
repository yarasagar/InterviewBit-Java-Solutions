public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int n = A.size();
        int sum = 0;
        for(int i=0; i<n; i++){
            int a = A.get(i);
            for(int j=i+1; j<n; j++){
                int b = A.get(j);
                sum=sum+countBits(a^b);
            }
        }
        return 2*sum;
    }
    public int countBits(int n){
        int c = 0;
        while(n != 0){
            c=c+(n&1);
            n >>= 1;
        }
        return c;
    }
}
