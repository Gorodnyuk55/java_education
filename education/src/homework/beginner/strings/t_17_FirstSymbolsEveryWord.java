package homework.beginner.strings;

/**
 * Write a program that take first symbol of every word in sentence and add
 * to new string
 */


public class t_17_FirstSymbolsEveryWord {
    public static void main(String[] args) {
        String sentance = "Love tells us many things that are not so";
        System.out.println(sentance);

        StringBuilder newWord = new StringBuilder();
        String [] array = sentance.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].charAt(0));
            newWord.append(array[i].charAt(0));
        }

        System.out.println(newWord);

    }
}
