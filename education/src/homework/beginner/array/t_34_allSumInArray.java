package homework.beginner.array;
//Write program that calculate and display summ of all array elements
public class t_34_allSumInArray {
    public static void main(String[] args) {
        int [] array = {5, 4, 6, 7, 8, 10, 2, 0, 4};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count +=array[i];
        }
        System.out.print("summ of all array elements " + count);

    }
}
