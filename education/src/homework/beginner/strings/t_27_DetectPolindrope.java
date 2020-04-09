package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 *
 *
 */

public class t_27_DetectPolindrope {
    public static void main(String[] args) {
        String word1 = "Anna";
        String word2 = "Kayak";
        String word3 = "Racecar";
        String word4 = "git";
        String word5 = "maven";


        System.out.println( word1 +  " polindrope " + isPolindrope(word1) );
        System.out.println( word2 +  " polindrope " + isPolindrope(word2) );
        System.out.println( word3 +  " polindrope " + isPolindrope(word3) );
        System.out.println( word4 +  " polindrope " + isPolindrope(word4) );
        System.out.println( word5 +  " polindrope " + isPolindrope(word5) );

    }

    public static boolean isPolindrope (String word){
       char [] array = word.toCharArray();
       StringBuilder str = new StringBuilder();

        for (int i = array.length-1; i >= 0; i--) {
            str.append(array[i]);
        }

        String newWorld = str.toString();

        if (word.equalsIgnoreCase(newWorld)) {
            return true;
        }
        else return false;



    }
}
