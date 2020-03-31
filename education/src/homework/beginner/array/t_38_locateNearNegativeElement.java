package homework.beginner.array;

/**
 *
 */

public class t_38_locateNearNegativeElement {
    public static void main(String[] args) {
        int[] array = {5, 4, 67, -5, 34, -6, -5, 6, -5, 7, 8, -5, -4};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                continue;
            }
            else{

                if (i != array.length-1) {
                    int timeValue = array[i];
                    int j = i + 1;
                    for ( ; j < array.length; j++) {
                        if(array[j] > 0){
                            break;
                        }
                        else {
                            timeValue += array[j];
                        }
                    }

                    if (timeValue != array[i]){
                        count += timeValue;
                    }

                    i = j;

                }
            }
        }
        System.out.println(count);



      /*  int count = 0;
        int indexNumber = 0;
        int indexNumberPrev = 0;

        for (int i = 1; i < array.length - 1; i++) {
           indexNumberPrev = indexNumber;
           if (array[i] < 0 && (array[i-1] < 0 || array[i+1] < 0)  ){
             count += array[i];
           }

        }

        if (array[0] < 0 && array[1] < 0 ){
            count += array[0];
        }

        if (array[array.length - 1] < 0 && array[array.length-2] < 0 ){
            count += array[array.length - 1];
        }

        System.out.println(count);*/
    }

}
