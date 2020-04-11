package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that replace the second occurrence of 'o' symbol in a
 * string by symbol ' !'
 *
 */

public class t_31_ReplaceSymbol {
    public static void main(String[] args) {
        String sentence = "Debugging becomes significantly easier if you first admit that you are the problem";
        int count = 0;

        StringBuilder str = new StringBuilder();

        int secondIndex = sentence.indexOf('o',sentence.indexOf('o')+1); //нашли второй символ
        System.out.println(str.append(sentence).replace(secondIndex,secondIndex,"!"));


       /* for (char c : sentence.toCharArray()) {
            if ( c == 'o'){
                count++;
            }

            if (count == 2){
              str.append('!');
              count++;
            }
            else {
                str.append(c);
            }

        }*/


    }

}
