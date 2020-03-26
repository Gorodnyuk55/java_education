package homework.beginner.utils;

public class CharChangePositionSymbols {
    public static void changePositionSymbols(char[] array, int indexChangeFirst, int indexChangeSecond){
        int step;
          if (indexChangeSecond == 0 || indexChangeFirst == 0){
              step = indexChangeFirst + indexChangeSecond + 1;
          }
          else step = indexChangeFirst + indexChangeSecond;


        for ( ; indexChangeFirst < array.length; indexChangeFirst  += step, indexChangeSecond += step) {

            if (indexChangeSecond >= array.length) {
                break;
            }

            array[indexChangeFirst] ^= array[indexChangeSecond];
            array[indexChangeSecond] ^= array[indexChangeFirst];
            array[indexChangeFirst] ^= array[indexChangeSecond];
        }
    }
}
