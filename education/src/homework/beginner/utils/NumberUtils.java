package homework.beginner.utils;

public class NumberUtils {
    public static int[] numberParser(int number){

        int[] integerArray = new int[(int)Math.log10(number) + 1];

        for (int i = integerArray.length - 1; i >= 0; i--) {
            integerArray[i] = number % 10;
            number /= 10;

        }
        return integerArray;



//       String[] array = Integer.toString(number).split("");
//
//        int[] numbersArray  = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            numbersArray[i] = Integer.valueOf(array[i]);
//        }
//        return numbersArray;



    }
}
