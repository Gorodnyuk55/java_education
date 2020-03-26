package homework.beginner.array;
// Write a program that change all negative numbers in the array to positive
public class t_32_ChangeAllNegativeNumber {
    public static void main(String[] args) {
        int [] array = {5, -3, 0, 4, 4, 3, -2, 0, 4};
        for (int number : array) {
            System.out.println(Math.abs(number));
        }
    }




}
