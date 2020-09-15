public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            if(hm.containsKey(B-A.get(i))){
                C.add(hm.get(B-A.get(i)));
                C.add(i+1);
                break;
            }else if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i),i+1);
            }
        }
        return C;
    }
}
