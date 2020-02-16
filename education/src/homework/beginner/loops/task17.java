package homework.beginner.loops;

import static java.lang.Math.log10;

public class task17 {
    /*Write a program that find swap first and last digits of the number 2345*/

    public static void main(String[] args) {
        int i =  2345;

      char[] mass =  Integer.toString(i).toCharArray();
      mass[0] ^= mass[mass.length-1];
      mass[mass.length-1] ^= mass[0];
      mass[0] ^= mass[mass.length-1];

      System.out.println(new String (mass));


        /*//переводим в строку
        String str = Integer.toString(i);
        System.out.println("превратили в стоку" + str);

        //вычисляем первый и последний элемент строки

        int lengthBy = str.length();
        System.out.println("кол символов " + lengthBy);

        //вычисляем первую и последнюю букву
        char firstChar = str.charAt(0);
        System.out.println("первая цифра - " + firstChar);

        char lastChar = str.charAt(lengthBy-1);
        System.out.println("последняя цифра - " + lastChar);

        //замена
        String newStr = lastChar + str.substring(1,str.length()-1) +
                firstChar;

        System.out.println(newStr);

        int newNumber = Integer.valueOf(newStr);
        System.out.println(newNumber);
*/
    }

}

