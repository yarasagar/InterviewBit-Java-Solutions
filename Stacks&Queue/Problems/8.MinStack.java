class Solution {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();
    public void push(int x) {
        if(s.empty()){
            s.push(x);
            ss.push(x);
        }else{
            if(ss.peek() < x){
                s.push(x);
            }else{
                s.push(x);
                ss.push(x);
            }
        }
    }

    public void pop() {
        if(!s.empty()){
            int t=s.peek();
            if(t > ss.peek()){
                s.pop();
            }else{
                s.pop();
                ss.pop();
            }
        }
    }

    public int top() {
        if(s.empty())
            return -1;
        return s.peek();
    }

    public int getMin() {
        if(s.empty())
            return -1;
        return ss.peek();
    }
}
