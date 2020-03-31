package homework.beginner.array;
/*
 *
 *@Maxim
 *Write a program that calculate sum of only negative array values
 */

public class t_37_SumNegativeElementInArray {
    public static void main(String[] args) {
        int[]array = {6, 5, 4,-7,-3, 3, 5, 2, 6, 8,-4,-7,-1};
        int count = 0;
        for (int i : array) {
            if (i < 0){
              count += i;
            }
        }
        System.out.println(count);
    }
}
