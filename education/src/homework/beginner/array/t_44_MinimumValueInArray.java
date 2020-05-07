package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that nd minimum value (sign of number does not matter)
 *
 */

public class t_44_MinimumValueInArray {
    public static void main(String[] args) {
        int [] array = {4, 5,-23, -1234, 456, 7, -44, -1, 45, 23, 23, 1, 2};
        int minNumber = 1000000;
        for (int i = 0; i < array.length; i++) {
          if (minNumber > Math.abs(array[i])){
              minNumber = Math.abs(array[i]);
          }

        }
        System.out.println(minNumber);
    }


}
