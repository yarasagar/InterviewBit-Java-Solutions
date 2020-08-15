public class Solution {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=2; i<A; i++){
            if(isPrime(i)){
                B.add(i);
            }
        }
        return B;
    }
    public boolean isPrime(int i){
        if(i <=1)
            return false;
        if(i <= 3)
            return true;
        if(i%2 == 0 || i%3 == 0)
            return false;
        for(int j=5; j*j<=i; j=j+6){
            if(i%j == 0 || i%(j+2) == 0)
                return false;
        }
        return true;
    }
}
