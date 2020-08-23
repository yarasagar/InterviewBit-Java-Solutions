public class Solution {
 public String solve(String a) {
    String arr[]=a.split(" ");
    String str=new String();
    for(int i=arr.length-1;i>=0;i--){
        if(!" ".contains(arr[i])){
            str=str.concat(arr[i].trim());
            str=str.concat(" ");
        }
    }
    return str.trim();  
 }
}
