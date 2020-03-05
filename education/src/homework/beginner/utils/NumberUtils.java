package homework.beginner.utils;

public class NumberUtils {
    public static int[] numberParser(int number){
        String[] array = Integer.toString(number).split("");
        int[] numbersArray  = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbersArray[i] = Integer.valueOf(array[i]);
        }
        return numbersArray;
    }
}
