package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 *
 * Write a program that find index of the rst occurrence of character 'f ' in string
 *
 */

import java.util.Arrays;

public class t_28_FindFirstCharacter {
    public static void main(String[] args) {
        String sentence = "A programming language is for thinking about programs, not for expressing" +
                "programs you've already thought of. It should be a pencil, not a pen forgiven";

        char letter = 'f';

        String[] arrayWorld = sentence.split(" ");
        for (int i = 0; i < arrayWorld.length; i++) {
            if (arrayWorld[i].charAt(0) == letter) {
                System.out.println(arrayWorld[i]);
            }

        }
    }
}
