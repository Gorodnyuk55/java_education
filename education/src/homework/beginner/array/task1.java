package homework.beginner.array;
     /*   Write a program that create an empty array of 6 elements and assign
        values from 1 to 6*/


     public class task1 {
         public static void main(String[] args) {
             int mass[] = new int[6];
             int k = 1;
             System.out.print("Массив - ");
             for (int i = 0; i < 6; i++) {
                 mass[i] = k;
                 k++;

                 System.out.printf("число %3d",mass[i]);
             }

         }
}
