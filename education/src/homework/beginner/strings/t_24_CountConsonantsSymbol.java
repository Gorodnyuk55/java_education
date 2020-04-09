package homework.beginner.strings;
        /*
         * @author Maxim Gorodnyuk
         *
         *
         *Write a program that count how many consonants in string
         */

public class t_24_CountConsonantsSymbol {
    public static void main(String[] args) {
        String sentence = "sdkfjgskjdfnvjksdfngjkasdafkbvkamsndiugkhbahjdfdbncva";
        char[] array = sentence.toCharArray();
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            int charToNumber = Character.valueOf(array[i]);
            if (charToNumber > 96 && charToNumber < 123 && (
                    charToNumber != 97 ||
                            charToNumber != 101 ||
                            charToNumber != 107 ||
                            charToNumber != 111 ||
                            charToNumber != 117 ||
                            charToNumber != 121)
            ) {
                count++;
            }


        }

        System.out.println(count);

    }
}