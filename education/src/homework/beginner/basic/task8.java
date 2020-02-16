package homework.beginner.basic;

//     task8
//     Write a program that exchange values from two variables:
//        • create two integer variables
//        • assign with random numbers (random means by you)
//        • create third variable and assign with values that hold first variable
//        • assign second variable with values that hold first variable
//        • assign first variable with values that hold third variable
//        • print on console values of first ans second variables


public class task8 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int c = a;

        b = a;
        a = c;

        System.out.println("values of first ans second variables are " + a + " and " + b );
    }
}
