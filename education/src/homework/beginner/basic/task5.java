package homework.beginner.basic;
/*
 * task5
 * Write a program that do the following code instructions:
 *    create an integer variable with assigning value 21
 *    create another integer variable with assigning value 11
 *    add to the first variable 1
 *    subtract 3 from the second variable
 *    print on console first and second variable values
 *
 */
public class task5 {
    public static void main(String[] args) {

        int var1 = 21;
        int var2 = 11;
        var1 +=1;
        var2 -=3;

        System.out.println("First variable equals " +var1+ " and second variable equals " +var2);

    }
}
