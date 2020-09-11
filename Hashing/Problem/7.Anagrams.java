public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            char[] B = A.get(i).toCharArray();
            Arrays.sort(B);
            String C = String.valueOf(B);
            if(hm.get(C) != null){
                ArrayList<Integer> D = hm.get(C);
                D.add(i+1);
                hm.put(C,D);
            }else{
                ArrayList<Integer> D = new ArrayList<>();
                D.add(i+1);
                hm.put(C, D);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
