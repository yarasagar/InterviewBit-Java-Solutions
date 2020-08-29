public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i=0;
        int j=0;
        ArrayList<Integer> c = new ArrayList<>();
        while(i<a.size() && j<b.size()){
            if(a.get(i) < b.get(j)){
                c.add(a.get(i));
                i++;
            }else{
                c.add(b.get(j));
                j++;
            }
        }
        while(i < a.size()){
            c.add(a.get(i));
            i++;
        }
        while(j < b.size()){
            c.add(b.get(j));
            j++;
        }
        a.clear();
        for(int t : c){
            a.add(t);
        }
    }
}
