package homework.beginner.basic;
        /*task20
        User enter on console a number from 21 to 65 than program must print
        magical square.*/

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MagicalSquareSum;
        for (; ;) {
            System.out.println("Enter a number from 21 to 65:");
            MagicalSquareSum = in.nextInt();

            if (MagicalSquareSum >= 21 && MagicalSquareSum <= 65 ){
                break;
            }
            else {
                System.out.println("You entered a number not from the specified interval  \n");
            };
        }

        int n = MagicalSquareSum;


        System.out.println((n-20)+"  "+1+"  "+12+"  "+7);
        System.out.println(11+"  "+8+"  "+(n-21)+"  "+2);
        System.out.println(5+"  "+10+"  "+3+"  "+(n-18));
        System.out.println(4+"  "+(n-19)+"  "+6+"  "+9);



    }
}
