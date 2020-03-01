package homework.beginner.loops;

public class task26 {
    /*
     *Write a program that display on console a figure
     */

        public static void main(String[] args) {

            for (int i = 1; i <= 20 ; i++) {
                if (i % 2 != 0){
                    System.out.print("/");
                }
                else {
                    System.out.print("\\");
                }
            }
        }
    }

