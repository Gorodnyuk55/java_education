package homework.beginner.basic;

/*
 *
 * task 6
 * Write a program that do the following code instructions:
 * create three integer type variables
 * assign all variables by value 11
 * create fourth variable
 * add all three variable values and assign result to the fourth variable
 * display result on console
 *
*/

public class task6 {
    public static void main(String[] args) {

        int var1;
        int var2;
        int var3;

        var1 = var2 = var3 = 11;

        int var4;

        var4 = var1 + var2 + var3;

        System.out.println(var4);

    }
}
