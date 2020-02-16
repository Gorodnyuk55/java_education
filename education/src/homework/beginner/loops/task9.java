package homework.beginner.loops;
/*
    Write a program that find all divisors of a number 18
 */
public class task9 {
    public static void main(String[] args) {
        int numb = 18;

        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0){
                System.out.printf("%3d", i);
            }
        }

    }

}
