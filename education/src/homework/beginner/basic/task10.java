package homework.beginner.basic;

/*         task10
      Write a program that subtract one variable from other:
        • define a function that take two integer variables and return they
        subtraction result
        • call previously defined function with parameters values 123 and 111
        • print result on console*/


    public class task10 {
        public static void main(String[] args) {

            int subtract = subtractTwoVariable(123, 111);
            System.out.println(subtract);
        }

        public static int subtractTwoVariable(int a, int b) {
            return a - b;
        }

    }
