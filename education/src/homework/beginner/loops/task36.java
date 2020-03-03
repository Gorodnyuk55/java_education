package homework.beginner.loops;
 /*Write a program that display  english alphabet as a triangle*/
public class task36 {
    public static void main(String[] args) {

        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= i; j++) {
                int z = i + 96;
                char c = (char)z;
                System.out.print( c + " ");

            }
            System.out.println();
        }

    }
}
