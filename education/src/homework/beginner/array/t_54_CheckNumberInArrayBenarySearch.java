package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 *
 *
 */



import java.util.Arrays;

public class t_54_CheckNumberInArrayBenarySearch {
    public static void main(String[] args) {
        int [] array1 = {5, 2, 1, 4, 7, 9, 10, 1001 ,44, 5, 3445 , 2222 , 1234567, 987 , 3};
        int [] array2 = {5, 8, 3, 8, 4, 3, 6, 444 , 66, 4, 66, 55};
        int searchNumber1 = 3;


        System.out.println(checkNumberBenarySearch(searchNumber1, array1));
        System.out.println(checkNumberBenarySearch(searchNumber1, array2));

    }



    public static boolean checkNumberBenarySearch(int searchNumber, int [] array){
        boolean checkNumber = false;
        Arrays.sort(array);
        int firstIndexInArray = 0;
        int lastIndexInArray = array.length-1;

        while (firstIndexInArray  <= lastIndexInArray ) {
          int middleIndex = (firstIndexInArray + lastIndexInArray) / 2;
            if (array[middleIndex] < searchNumber){
                firstIndexInArray = middleIndex + 1;
            }
            else if (array[middleIndex]>searchNumber){
                lastIndexInArray = middleIndex -1;
            }
            else if (array[middleIndex]==searchNumber){
                checkNumber = true;
                break;
            }
        }

        return checkNumber;
    }
}
