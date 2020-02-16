package homework.beginner.basic;

            /*task28
            Write a program that calculate 5! (do not use loop)
            n! = 1 · 2 · 3 · ...n
            */


public class task28 {


       static int factorial(int n){
        if (n == 1) {
           /* System.out.println(n);*/
            return 1;
        }
        else
            System.out.println(n);
            return(n * factorial(n-1));

    }
    public static void main(String args[]){
        int fact=1;
        int number=5;
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }



}