import java.util.Scanner;

//    Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//    Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
public class grading {
    public static void main(String[] args) {
        System.out.println("Please enter your score");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
        System.out.println(grade(x));
}

static String grade(int x) {
    if (x > 90 && x <= 100) {
        return "AA";
    }
    if (x > 80 && x <= 90) {
        return "AB";
    }
    if (x > 70 && x <= 80) {
        return "BB";
    }
    if (x > 60 && x <= 70) {
        return "BC";
    }
    if (x > 50 && x <= 60) {
        return "CD";
    }
    if (x > 40 && x <= 50) {
        return "DD";
    } if (x > 0 && x <= 40) {
        return "Fail";
    }

    else {
        return "Number not in range";
    }

}
}
