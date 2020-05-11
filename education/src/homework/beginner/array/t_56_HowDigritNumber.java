package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check how many time digit 5 presents in the array
 * only in negative elements
 *
 */

public class t_56_HowDigritNumber {
    public static void main(String[] args) {
        int [] array = {-125, 4,-4, -5,-7,-999,-7,-11,-777,-77,-43, 45, 67, 999, 234, 173, 761};
        System.out.println(howDigritNumber(array));

    }

    public static int howDigritNumber(int[] array){
        int count = 0;
        for (int i : array) {
            if (i % 5 == 0 && i < 0) {
                count++;
            }

        }
        return count;
    }

}
