package homework.beginner.basic;


/*         task11
     Write a program that multiplying two variables:
        • define a function that take two integer variables and return they multiplication result
        • call previously defined function with parameters values 10 and 11
        • print result on console
*/


public class task11 {



        public static void main(String[] args) {

            int multiply = multiplyTwoVariable(10, 11);
            System.out.println(multiply);
        }

        public static int multiplyTwoVariable(int a, int b) {
            return a * b;
        }

}
