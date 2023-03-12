public class isPrime {
    public static void main(String[] args) {
        //call the function and print to screen here
        System.out.println(isitprime(9));
    }
    //create the function isitPrime that accept an integer value and returns true if the integer is a prime and false if otherwise
    static boolean isitprime(int x){
        if (x<2){
            return  false;
        }
        for(int a = 2; a<x; a++){
            if(x%a == 0){
                return false;
            }
        }return true;
    }
}
