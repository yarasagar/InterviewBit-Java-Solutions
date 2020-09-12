public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> B = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            B.add(A.get(i)+"");
        }
        Collections.sort(B, new Comparator<String>(){
           public int compare(String a, String b){
               return (a+b).compareTo(b+a) > 0 ?-1:1;
           }
        });
        Iterator<String> i = B.iterator();
        StringBuilder sb = new StringBuilder();
        while(i.hasNext()){
            sb.append(i.next());
        }
        int n = sb.length();
        int j=0;
        while(j<n && sb.charAt(j) == '0'){
            j++;
        }
        if(j == n){
            return "0";
        }else{
            return sb.toString().substring(j);
        }
    }
}
