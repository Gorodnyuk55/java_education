package homework.beginner.strings;

/**
 *
 * Write a program that check how many numeric symbols contains in string
 *
 */
public class t_20_checkNumbersInSentance {
    public static void main(String[] args) {
        String sentence = "iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj";
        char array[] = sentence.toCharArray();
        int count = 0;

        for (char symbol : array) {
            int number = Character.valueOf(symbol);
            if (number > 47 && number < 57){
                count++;
            }

        }

        System.out.println(count);

    }
}
