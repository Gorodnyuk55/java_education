package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that insert 1 after each letter (spaces must be ignored)
 *
 */

public class t_25_InsertOne{
    public static void main(String[] args) {
        String sentence = "I want to become a programmer";
        StringBuilder str = new StringBuilder();
        for (char symbol : sentence.toCharArray()){
            str.append(symbol);
            if (symbol != ' '){
               str.append(1) ;
            }

        }

        System.out.println(str);

    }

}


