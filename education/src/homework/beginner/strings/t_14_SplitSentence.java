package homework.beginner.strings;

import java.util.Arrays;

public class t_14_SplitSentence {
    public static void main(String[] args) {
        String sentense = "He who licks knives will soon cut his tongue";
        System.out.println(sentense);

        String [] sentenseArray = sentense.split(" ");
        System.out.println(Arrays.toString(sentenseArray));
    }
}
