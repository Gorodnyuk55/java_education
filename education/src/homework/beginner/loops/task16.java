package homework.beginner.loops;

/*Write a program that find multiplication of all digits of the number 876432*/

public class task16 {
    public static void main(String[] args) {
        int numb = 876432;
        int  multipli=1;

        System.out.println("Number - " + numb);

        //циклом делить на десять и умножать остаток
        for (int b = 10; numb > 0; numb /= b) {

            int a = numb % b;
            System.out.printf( "%2d", a );
             multipli *=a;

        }
          System.out.println();
          System.out.println(multipli);

    }



}
