package homework.beginner.basic;

/*task12
Write a program that divide two variables:
        • define a function that take two integer variables and return they
        division result
        • call previously defined function with parameters values 12 and 4
        • print result on console*/

public class task12 {
    public static void main(String[] args) {

        int division = divisionTwoVariable(12, 4);
        System.out.println(division);
    }

    public static int divisionTwoVariable(int a, int b) {
        return a / b;
    }


}
