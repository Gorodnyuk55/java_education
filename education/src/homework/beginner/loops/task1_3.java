package homework.beginner.loops;
/*
   Write a program that print on console all numbers from -10 to 10 with step 1
 */
public class task1_3 {
    public static void main(String[] args) {
        int maxNumb = 10;
        int minNumb = -10;
        int numbResult;
        for (int i = minNumb; i <= maxNumb; i++) {
            if (i >= minNumb){
                numbResult = i;
                System.out.print(numbResult + " ");
            }

        }
    }
}
