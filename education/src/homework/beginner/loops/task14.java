package homework.beginner.loops;
  /*Write a program that find first and last digits of the number 229345*/
public class task14 {
      public static void main(String[] args) {
              int numb = 229345;
              int firstNumb = 0, lastNumb;

          System.out.println("Number - " + numb);

          for (int i = 1; i <= numb; i *= 10) {
              firstNumb = numb / i;
          }
          System.out.println( "first symbol - " + firstNumb );
          

          int j = numb;
          int b = 0;
          while (j >= 10) {

              b = j % 10;
              if (b % 10 == 0) continue;
              else break;
          }

          lastNumb = b;
          System.out.println( "last symbol - " + lastNumb );
         





            /* String str = String.valueOf(numb);
              int symbol = str.length();
               *//* System.out.println(symbol);*//*
              double divider = Math.pow(10,symbol-1) ;
              *//*System.out.println(divider);*//*

              firstNumb = (int) (numb / divider);
              System.out.println( "first number - " + firstNumb );

              lastNumb = (int) (numb % 10);
              System.out.println( "last number - " + lastNumb  );
*/

      }



}
