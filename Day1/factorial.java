public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int x){
        int a = 1;
        if(x ==0 || x==1){
            return 1;
        }
        if(x<0){
            return -1;// return -1 if the number is a negative number
        }
        for(int i = x; i>0; i--){
            a *= i;
        }return a;
    }
}
