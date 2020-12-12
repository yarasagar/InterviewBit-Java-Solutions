public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        long max_so_Far = 0;
        long max = 0;
        int s = -1;
        int e = -1;
        int s1 = 0;
        int e1 = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) < 0){
                s1 = i+1;
                e1 = i+1;
                max_so_Far = 0;
            }else{
                max_so_Far = max_so_Far+A.get(i);
                if(max_so_Far > max || max_so_Far == max && (e1-s1 > e-s)){
                    max = max_so_Far;
                    s = s1;
                    e = i;
                }
                e1++;
            }
        }
        if(s == -1)
            return B;
        else{
            for(int i=s; i<=e; i++){
                B.add(A.get(i));
            }
        }
        return B;
    }
}
