public class Solution {
    public String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while(A != 0){
            if(A%26 == 0){
                sb.insert(0,(char)(26+64));
                A=A-26;
            }else{
                sb.insert(0,(char)(A%26+64));
                A=A-A%26;
            }
            A=A/26;
        }
        return sb.toString();
    }
}
