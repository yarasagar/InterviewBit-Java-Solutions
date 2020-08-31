public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            if(s.empty()){
                B.add(-1);
                s.push(A.get(i));
            }else{
                while(!s.empty() && s.peek()>=A.get(i)){
                    s.pop();
                }
                if(s.empty()){
                    B.add(-1);
                    s.push(A.get(i));
                }else if(s.peek()<A.get(i)){
                    B.add(s.peek());
                    s.push(A.get(i));
                }
            }
        }
        return B;
    }
}
