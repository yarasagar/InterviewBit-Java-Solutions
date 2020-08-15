public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> B = new ArrayList<String>();
        for(int i=1; i<=A; i++){
            if(i%15 == 0){
                B.add("FizzBuzz");
            }else if(i%5 == 0){
                B.add("Buzz");
            }else if(i%3 == 0){
                B.add("Fizz");
            }else{
                B.add(i+"");
            }
        }
        return B;
    }
}
