package homework.beginner.loops;
/*
   Write a program that create an integer variable with value 100 and decreasing
    by 1 in every loop iteration until the value of the variable won’t
    reach 50
 */
public class task1_4 {
    public static void main(String[] args) {

      /*  for (int i = 100; i >=50 ; i--) {
            System.out.printf("%2d%n",i);
        }*/


       /*  int numb = 100;
        while (numb >= 50){
            System.out.printf("%10d%n",numb);
            numb--;

        }*/

        int minNumb = 50;
        int numb = 100;
        for ( ; numb >= minNumb; numb--) {
                System.out.println(numb);
            }

    }

}
