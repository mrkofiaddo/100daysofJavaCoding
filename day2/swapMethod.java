// a simple method that swaps values of two integer variables
public class swapMethod {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        //call letsswap function on the two integer values.
        letsswap(a,b);
        //output on screen and check if it worked

    }
    //creating method
    static void letsswap(int a, int b){
        int temp = b;
        b= a;
        a= temp;
        System.out.println("a is now "+ a +" and b is now " + b);
    }
}
