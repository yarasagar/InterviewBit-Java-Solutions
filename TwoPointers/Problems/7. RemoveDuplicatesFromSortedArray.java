public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int n = a.size();
        if(n == 0 || n == 1)
            return n;
        int j = 0;
        for(int i=0; i<n-1; i++){
            if(a.get(i).compareTo(a.get(i+1)) != 0){
                a.set(j++,a.get(i));
            }
        }
        a.set(j++,a.get(n-1));
        return j;
    }
}
