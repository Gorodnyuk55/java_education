package homework.beginner.basic;
import java.lang.*;

/*         task9
              Write a program that add two variables
                    • define a function that take two integer variables and return they
                    sum
                    • call previously defined function with parameters values 345 and 6
                    • print result on console*/


public class task9 {
    public static void main(String[] args) {
        int sum = addTwoVariable(345,6);
        System.out.println(sum);
    }

    public static int addTwoVariable(int a, int b){
        return a + b;
    }



}
    /*   int a = 345;
            int b = 6;

            System.out.println("The sum is = " + Integer.sum(a, b));*/