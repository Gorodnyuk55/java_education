package homework.beginner.strings;

/**
 *
 * Write a program that count how many uppercase symbols in string
 *
 */
public class t_21_UppercaseSymbols {
    public static void main(String[] args) {
        String sentence = "sdgHjhgJHGHJggSLsjLKSkjhkjhSjhkSkhsk";
        char [] array = sentence.toCharArray();
        int count = 0;

        for (char symbol : array) {
            if (symbol == Character.toUpperCase(symbol)){
             count++;
            }
        }
        System.out.println(count);



    }


}
