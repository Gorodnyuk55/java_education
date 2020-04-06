package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that count how many vowels in string
 *
 */

public class t_23_CountVawelsSymbol {
    public static void main(String[] args) {
        String sentence = "asdjfhwuqyetrnzxbcvcpoxincumbniuoqwyenzxcbmzvnbcqtyrenbvzcpoiedsfmngb";
         char[] array = sentence.toCharArray();
         int count = 0;

         for (int i = 0; i < array.length; i++) {
             if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' ||+
                     + array[i] == 'u' || array[i] == 'y' ){
                 count++;
             }

         }
        System.out.print(count);

    }



}
