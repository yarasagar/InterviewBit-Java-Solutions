public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hsA = new HashSet<>();
        HashSet<Integer> hsB = new HashSet<>();
        HashSet<Integer> hsC = new HashSet<>();
        TreeSet<Integer> hsAll = new TreeSet<>();
        for(int i=0; i<A.size(); i++){
            hsA.add(A.get(i));
            hsAll.add(A.get(i));
        }
        for(int i=0; i<B.size(); i++){
            hsB.add(B.get(i));
            hsAll.add(B.get(i));
        }
        for(int i=0; i<C.size(); i++){
            hsC.add(C.get(i));
            hsAll.add(C.get(i));
        }
        Iterator<Integer> i = hsAll.iterator();
        while(i.hasNext()){
            int x = i.next();
            if(hsA.contains(x) && hsB.contains(x)){
                res.add(x);
            }else if(hsA.contains(x) && hsC.contains(x)){
                res.add(x);
            }else if(hsB.contains(x) && hsC.contains(x)){
                res.add(x);
            }
        }
        return res;
    }
}
