package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check arrays for identity (two arrays are identical
 * if they contain the same amount of elements, and all values of elements
 * are identical)
 *
 */

public class t_55_CheckArrayForIdentity {
    public static void main(String[] args) {
        int [] array1 = {9, 8, 7, 6, 5};
        int [] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int [] array3 = {9, 8, 7, 6, 5};

        System.out.println(checkArrayForIdentity(array1, array2));
        System.out.println(checkArrayForIdentity(array1, array3));
        System.out.println(checkArrayForIdentity(array2, array3));
    }




    public static boolean checkArrayForIdentity(int [] array1,  int [] array2){
        boolean isIdentity = false;
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i] ){
                    isIdentity = true;
                }
                else  isIdentity = false;
            }

        }
        return isIdentity;

    }





}
