public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
            if(a.get(i) != b){
                c.add(a.get(i));
            }
        }
        a.clear();
        for(int t : c){
            a.add(t);
        }
        return a.size();
    }
}
