package homework.beginner.strings;
//convert string into two strings. First string
//must contain only odds symbols of input string and second - evens.
public class t_15_convertStringInTwoString {
    public static void main(String[] args) {
        String sentence = "wejhbnpolkdshjnjwe";
        System.out.println(sentence);
        char [] sentenceArray = sentence.toCharArray();


        StringBuilder newStringOne = new StringBuilder();
        StringBuilder newStringTwo = new StringBuilder();
        for(int i = 0; i < sentenceArray.length; i++) {

            if (i % 2 == 0) {
                newStringOne.append(sentenceArray[i]);
            }

            else {
                newStringTwo.append(sentenceArray[i]);
            }

        }
        System.out.println(newStringOne);
        System.out.println(newStringTwo);



    }
}
