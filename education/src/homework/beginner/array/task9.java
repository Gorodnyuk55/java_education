package homework.beginner.array;

/**
 *
 * Write a program that create an empty arrays of 12 elements, than assign
 * first 4 elements with value 1, next 4 elements with value 2, next 4 elements
 * with value 3, after that display all elements on console
 *
 */
public class task9 {
    public static void main(String[] args) {
        int mass[] = new int[12];
        int firstPart = mass.length / 3;
        int secondPart = firstPart *2;


        for (int i = 0; i < 12; i++) {
            if (i < firstPart){
              mass[i] = 1;
            }

            else if (i < secondPart){
                mass[i] = 4;
            }
            else mass[i] = 3;

            System.out.printf("%4d", mass[i]);
        }

    }
}
