package homework.beginner.loops;
   /* Write a program that display all numbers from 1 to 21 in triangle way*/
public class task35 {
       public static void main(String[] args) {
           System.out.println("Output 1");
           int x = 0;
           for (int i = 1; i <=6 ; i++) {

               for (int j = 6; j >=1 ; j--) {

                   if (i >= j){
                       x++;
                       System.out.print(x + " ");
               }
                   else  System.out.print(" ");


               }
               System.out.println();
           }


           System.out.println("\n");

           System.out.println("Output 2");
           for (int i = 1; i <= 6; i++) {
               for (int j = 6; j >= 1; j--) {
                   if (i >= j ) {
                       System.out.print(i + " ");
                   }
                   else System.out.print(" ");
               }
               System.out.println();
           }







       }
}
