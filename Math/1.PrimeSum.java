public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=2; i<A; i++){
            if(isPrime(i) && isPrime(A-i)){
                B.add(i);
                B.add(A-i);
                break;
            }
        }
        return B;
    }
    public boolean isPrime(int n){
        if(n <= 1)
            return false;
        if(n <= 3)
            return true;
        if(n%2 == 0 || n%3 == 0)
            return false;
        for(int i=5; i*i<=n; i=i+6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
