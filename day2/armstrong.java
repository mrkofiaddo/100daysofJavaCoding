// a simple algorithm that determines if a number is an armstrong number or not
// an armstrong number is a number that is the same as the sum of individual cubes of the number
// example is 153
public class armstrong {
    public static void main(String[] args) {
        System.out.println(isarmstrong(370));
    }
    static boolean isarmstrong(int num ){
        int comp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num /= 10;
        }return sum == comp;
        }
    }

