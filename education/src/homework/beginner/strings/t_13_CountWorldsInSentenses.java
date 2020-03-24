package homework.beginner.strings;

// Write a program that count words in sentence

public class t_13_CountWorldsInSentenses {
    public static void main(String[] args) {
        String sentence = "All programming is maintenance programming " +
         "because you  are    rarely writing original code' Dave Thomas  ";

        System.out.println(worldsCount(sentence));


    }

        private static int worldsCount(String sentence){

        int count = 0;

        char[] sentenceArray = sentence.toCharArray();

            for (int i = 0; i < sentenceArray.length; i++){
                sentenceArray[i] = sentence.charAt(i);

                if  ( ((i>0)&&(sentenceArray[i]!=' ')&&(sentenceArray[i-1]==' '))
                 || (sentenceArray[i] != 0 && i == 0)) {
                    count++;
                }
            }

            return count;
        }





}


