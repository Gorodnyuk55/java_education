package homework.beginner.strings;
/*Write a program that convert the second and the last but one symbol in
        string to upper case for every word*/
public class t_9_ConvertSecondAndLastSymbol {
    public static void main(String[] args) {
        String defaultString = "Black souls wear white shirts";
        System.out.println(defaultString);
        String [] parseWord = defaultString.split(" ");

        for (int i = 0; i < parseWord.length; i++) {

            String[] lettersIntoWorld = parseWord[i].split("");


            for (int j = 0; j < lettersIntoWorld.length; j++) {
                if (j == 1 || j == lettersIntoWorld.length-2){
                    lettersIntoWorld[j] = lettersIntoWorld[j].toUpperCase();
                }

                System.out.print(lettersIntoWorld[j] + "");
            }
            System.out.print(" ");
        }

    }
}
