public class Solution {
    public String simplifyPath(String A) {
        int n = A.length();
        if(n < 2)
            return new String();
        Stack<String> s = new Stack<>();
        for(int i=0; i<n; i++){
            String sb = "";
            while(i<n && A.charAt(i) == '/'){
                i++;
            }
            while(i<n && A.charAt(i) != '/'){
                sb += A.charAt(i);
                i++;
            }
            if("..".equals(sb)){
                if(!s.empty()){
                    s.pop();
                }
            }else if(".".equals(sb)){
                continue;
            }else if(sb.length() != 0){
                s.push(sb);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while(!s.empty()){
            sb2.insert(0,"/"+s.pop());
        }
        return sb2.length() == 0 ? "/" : sb2.toString();
    }
}
