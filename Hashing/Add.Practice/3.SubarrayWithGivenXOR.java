public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] xorArr = new int[n];
        xorArr[0] = A.get(0);
        for(int i=1; i<n; i++){
            xorArr[i] = xorArr[i-1]^A.get(i);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            int x = xorArr[i]^B;
            if(hm.containsKey(x)){
                ans += hm.get(x);
            }
            if(xorArr[i] == B)
                ans++;
            if(hm.containsKey(xorArr[i])){
                hm.put(xorArr[i],hm.get(xorArr[i])+1);
            }else{
                hm.put(xorArr[i],1);
            }
        }
            return ans;
    }
}
