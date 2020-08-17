public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        long d = 0;
        long n = A.size();
        for (int i = 0; i < 32; i ++) {
            long ones = 0;
            for (int j = 0; j < n; j ++) {
                int v = A.get(j);
                ones += (v >> i) & 1;
            }
            d += ones * (n - ones) * 2;
        }
        return (int) (d % 1000000007);
    }
}
