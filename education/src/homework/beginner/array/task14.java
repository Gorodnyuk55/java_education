package homework.beginner.array;
/*
write a program that check if an array contains value 5
*/

public class task14 {
    public static void main(String[] args) {
       int mass1[] = {6, 4, 3, 9, 10, 12, -45};
       int mass2[] = {7, 4, 5, 0, -39, 23};

       int searchNumbeur = 0;
        for (int contains:mass1
             ) {
            if (contains == 5) {
                searchNumbeur = 5;
            }

        }

        if (searchNumbeur == 5){
            System.out.println("Array contains value 5");
        }
        else System.out.println("Array NOT contains value 5");


    }
}
