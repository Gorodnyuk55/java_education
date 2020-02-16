package homework.beginner.basic;

// Write a program that check if 2 belong to the interval [1, 6]

public class task15 {
    public static void main(String[] args) {
        int checkVariable = 2;


        boolean checkBelong = 1 <= checkVariable && checkVariable <= 6;

        if (checkBelong == true) {
            System.out.println("checkVariable belong to the interval [1, 6]");
        } else {
            System.out.println("checkVariable not belong to the interval [1, 6]");
        }
    }
}
