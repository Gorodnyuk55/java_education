package homework.beginner.loops;
/*
 *Write a program that display on console a figure
 */
public class task25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 32 ; i++) {
            if (i % 3 != 0){
                System.out.print("-");
            }
                else System.out.print("|");


        }
    }
}
