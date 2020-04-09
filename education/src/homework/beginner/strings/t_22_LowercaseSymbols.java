package homework.beginner.strings;

/**
 *
 * Write a program that count how many lowercase symbols in string
 *
 */

public class t_22_LowercaseSymbols {


        public static void main(String[] args) {
            String sentence = "JHGJHGhjgHGUY GUY SJJKhjhkjUIUIHJhjhKJHGK";
            char [] array = sentence.toCharArray();
            int count = 0;

            for (char symbol : array) {
                if (symbol == Character.toLowerCase(symbol)){
                    count++;
                }
            }
            System.out.println(count);
        }

}
