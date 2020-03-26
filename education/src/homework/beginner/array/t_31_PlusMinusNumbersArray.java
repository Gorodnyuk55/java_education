package homework.beginner.array;
//Write a program that use the array to print on console that use the array to print on console (if number positive
//print '+' number's time, if number is negative print '-' number's time, if
//0 just print nothing

public class t_31_PlusMinusNumbersArray {
    public static void main(String[] args) {
        int [] array = {5, -3, 0, 4, 4, 3, -2, 0, 4,};

        for (int i = 0; i < array.length; i++) {
          if (array[i] > 0) {
              for (int j = 0; j < array[i]; j++) {
                  System.out.print("+");
              }
              System.out.println();
            }
          else if (array[i] < 0) {

              for (int j = array[i]; j < 0 ; j++) {
                  System.out.print("-");
              }
              System.out.println();
          }

          else System.out.println();
        }
     }
}
