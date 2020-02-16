package homework.beginner.loops;
/*
    Write a program that print on console all number from 20 to 40 with
    step 1 (40 must be not included)
 */

public class task1_2 {
    public static void main(String[] args) {
        int maxNumb = 40;
        int minNumb = 20;
        int numbResult;
        for (int i = 0; i < maxNumb; i++) {
            if (i >= minNumb){
                numbResult = i;
                System.out.println(numbResult);
            }

        }
    }

/*
    public static void main(String[] args) {
        int i = 20;
        while(i < 40 && i >=20){
           System.out.println(i);
           i++;
        }
    }
*/





}
