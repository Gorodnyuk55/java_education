package homework.beginner.array;

import java.util.Arrays;

public class Lesson_FillAnArray {
    public static void main(String[] args) {
        int[] fillAnArray = new int[15];
        int center = fillAnArray.length / 2;
        int count = center;
        int zero = 0;

        System.out.println("Output 1");
        int plus, minus;
        plus = minus = count;
        for (int i = 0; i <= center; i++) {
            fillAnArray[plus] = i;
            fillAnArray[minus] = i;
            plus++;
            minus--;
        }



     /*   System.out.println("Output 2");
        for (int i = 0; i < fillAnArray.length; i++) {
            if (center >  i){
                fillAnArray[i] = count;
                count--;
            }
            else {
                fillAnArray[i] = zero;
                zero++;
            }
        }*/


//        System.out.println("Output 3");
//        for (int i = 0; i < count; i++) {
//            fillAnArray[i] = center;
//            center--;
//        }
//        System.out.println(count);
//
//        for (int i = 0; i <= fillAnArray.length / 2; i++) {
//            fillAnArray[count] = i;
//            count++;
//        }


        System.out.println(Arrays.toString(fillAnArray));
    }
}
