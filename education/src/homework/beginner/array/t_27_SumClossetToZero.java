package homework.beginner.array;
/*Write a program that determine two elements in an array of integer whose
        sum is closest to zero*/


public class t_27_SumClossetToZero {
    public static void main(String[] args) {
        int[] array = {-5, 1,25,-36,11,14,7,63,16,24,101,100,-22,17,7,-2};

        int zero = 0;
        int summa = 0;
        int number1 = 0;
        int number2 = 0;
        int minimalRandomNumber = 100000000;
        int summaPlus = 0;
        int summaMinus = 0;


        for  (int i = 0; i <= array.length; i++) {

            for (int j = i+1; j <= array.length-1; j++) {
                summa = Integer.valueOf(array[i]+array[j]);
                System.out.print(summa + " ");

               /* if (sum == zero){
                    number1 = i;
                    number2 = j;
                };*/

               if ( Math.abs(minimalRandomNumber) > Math.abs(summa)/* && summa >= 0*/){
                    {
                        minimalRandomNumber = summa;
                        number1 = i;
                        number2 = j;
                        summaPlus = summa;
                    }

                }
/*
                if ( minimalRandomNumber > summa && summa <= 0){
                    {
                        minimalRandomNumber = summa;
                        number1 = i;
                        number2 = j;
                        summaMinus = summa;
                    }

                }*/

            }
             System.out.println();
        }

        System.out.println();
        System.out.println(array[number1]+ " и "+array[number2] + " сумма = " + summaPlus);

    }

}
