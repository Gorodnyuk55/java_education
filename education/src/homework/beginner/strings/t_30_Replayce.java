package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 *Write a program that replace all spaces in a string by symbol '-'
 *
 */

public class t_30_Replayce {
    public static void main(String[] args) {
        String sentence = "Laziness is your best friend: Never do twice what you can automate once";
        StringBuilder str = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (c == ' '){
               str.append('-');

            }
            else  {
                str.append(c);
            }
       }

        System.out.println(str);



    }
}
