package homework.beginner.loops;

/*Write a program that check if the numbers are palindromes*/

public class task23 {
    public static void main(String[] args) {
        int number = 668816;

        String s = new StringBuilder(number+"").reverse().toString();
        System.out.println(s.equals(number+"") ? "polindrome" : "no polindrome");

        /*System.out.println("number - " + number);

        int i = number;
        String strChar;
        String strNumber = Integer.toString(i % 10);
        i = i / 10;

        while (i != 0) {
            int count = i % 10;
            i = i / 10;
            strChar = Integer.toString(count);
            strNumber += strChar;
        }

        int reversNumber = Integer.parseInt(strNumber);

        System.out.println("revers number - " + reversNumber);


        if (number == reversNumber){
            System.out.println("palindromes number");
        }
        else {
            System.out.println("NOT palindromes number");
        }
*/
    }
}
