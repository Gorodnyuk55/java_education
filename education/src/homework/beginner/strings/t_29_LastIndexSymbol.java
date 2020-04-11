package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 *Write a program that find index of the last occurrence of character 'p' in
 * string
 *
 */

public class t_29_LastIndexSymbol {
    public static void main(String[] args) {
        String sentence = "Correctness is clearly the prime quality: If a system does not do what" +
                "it is supposed to do, then everything else about it matters little";

        System.out.println(sentence.indexOf('p'));
        System.out.println(sentence.lastIndexOf('p'));


    }
}
