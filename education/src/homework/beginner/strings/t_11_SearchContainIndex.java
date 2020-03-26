package homework.beginner.strings;
    // write a program that create and display an array that contain indexes
    // of symbol 'o' in string

public class t_11_SearchContainIndex {


    public static void main(String[] args) {
        String text = "Fools love not the wise, drunkards love not the sober";
        char[] textArray = new char[text.length()];
        char searchLetter = 'o';

        for (int i = 0; i < text.length() ; i++) {
            textArray[i] = text.charAt(i);

            if (textArray[i] == searchLetter) {
                System.out.print( i + " ");
            }

        }

    }
}
