package homework.beginner.loops;
   /* Write a program that find min and max digits in the number 23456431*/
public class task20 {
       public static void main(String[] args) {
           int number = 23456431;
           int maxNumber, minNumber;

           int  count= 0;
           maxNumber = minNumber = count;
           int i = number;          // сделаем переменную для цикла
           minNumber = number % 10; // запишим первое число для сравнения

           while (i != 0){
               count = i % 10;
               i = i/10;
               System.out.println(count);

                if (count <= minNumber) minNumber = count;
                if (count >= maxNumber) maxNumber = count;
           }
           System.out.println("min  - " + minNumber);
           System.out.println("max  - " + maxNumber);
       }
}



