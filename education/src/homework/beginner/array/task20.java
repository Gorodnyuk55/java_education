package homework.beginner.array;

import java.util.Arrays;

public class task20 {
        public static void main(String[] args) {
            int[] mass1 = {6, 34, 234, 65, 0, -54, -3, 6, 3, 5};
            int[] mass2 = {6, 4, 3, 6, 4, -4};
            System.out.println("arrays 1 - " + Arrays.toString(mass1));
            System.out.println("arrays 2 - " + Arrays.toString(mass2));

            //находим колличество элементов в новом массиве
            int mass1Length = mass1.length;
            int mass2Length = mass2.length;

            int massNewLenght = mass1Length + mass2Length;

            // создаем новый массив
            int [] massNew = new int  [massNewLenght];
            int k = 0;

            //перебираем первый старый массив
            for (int countMass1: mass1
            ) {
                if (k < mass2Length*2){
                    massNew[k] = countMass1;
                    k += 2;
                }
                else {
                    massNew[k] = countMass1;
                    k++;
                }
            }


            //перебираем второй старый массив
            int b = 1;
            for (int countMass2:mass2
            ) {
                if (b % 2 != 0){
                    massNew[b] = countMass2;
                }
                b +=2;
            }

            System.out.println("arrays New - " + Arrays.toString(massNew));

        }
}
