package homework.beginner.loops;

/*Write a program that counts the numbers of digits in a number 145797353*/

public class task18 {
    public static void main(String[] args) {
        long basicNumber = 145797353;
        int quantity=0;
        long i = basicNumber;
        while (i !=0) {
            i/=10;
            quantity++;
        }

        System.out.println(quantity);
    }
}
