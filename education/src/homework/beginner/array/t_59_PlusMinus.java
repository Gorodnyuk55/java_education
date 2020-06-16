package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that use the array to print on console (if number positive
 * print '+' number's time, if number is negative print '-' number's time, if
 * 0 just print nothing)
 *
 */

public class t_59_PlusMinus {
    public static void main(String[] args) {
        int [] array = {5,-3, 0, 5,-2, 0, 0,-10, 12,-5,-7, 11, 0, 0, 4,-1};

        for (int arrayNumber:array) {
            if (arrayNumber > 0){
                System.out.println("+");
            }
            else if (arrayNumber < 0){
                System.out.println("-");
            }
            else
                System.out.println(" ");
        }
    }
}

