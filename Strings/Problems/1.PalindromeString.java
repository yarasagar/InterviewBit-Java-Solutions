public class Solution {
public int isPalindrome(String A) {
A = A.replaceAll("[^a-zA-Z0-9]", "");
A = A.replaceAll("\s","").toLowerCase();
int j = A.length() -1 ,i = 0;
while( (i < A.length()) && (j >= 0)){
if(A.charAt(i++) != A.charAt(j–))
return 0;
}
return 1;
}}
