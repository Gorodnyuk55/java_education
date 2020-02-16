package homework.beginner.loops;

 /*Write a program that create an integer variable and assigns value 10, use
loop increase value of variable by 2 four times*/


public class task1_1 {
    public static void main(String[] args) {
        int j = 10;
        for (int i = 0; i < 4; i++) {
            j += 2;
            System.out.println(j);
        }
    }
}
