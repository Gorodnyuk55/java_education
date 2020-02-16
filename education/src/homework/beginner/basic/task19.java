package homework.beginner.basic;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
            /*task19
            User enter from keyboard value of variable a and b, the program must
                decide and show on console result (if a more than b, or if a less than b,
                or a equal to b)*/

public class task19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println("a is more than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is eaqual than b");
        }



    }
}
