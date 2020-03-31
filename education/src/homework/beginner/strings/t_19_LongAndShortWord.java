package homework.beginner.strings;

/**
 *
 *Write a program that find that shortest and the longest word in sentence
 *
 */
public class t_19_LongAndShortWord {
    public static void main(String[] args) {
        String sentence = "No matter how hard you try the bull will never give milk";

        String[] array = sentence.split(" ");
        int min = array[0].length();
        int max = 0;
        for (int i = 0; i < array.length; i++) {


            if (min > array[i].length()) {
                min = array[i].length();
            }

            if (max < array[i].length()) {
                max = array[i].length();
            }

        }

        for (String word : array) {
            if (word.length() == min) {
                System.out.println("min = " + word);
            }

            if (word.length() == max) {
                System.out.println("max = " + word);
            }

        }

    }
}
