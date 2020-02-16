package homework.beginner.loops;

public class task2 {
    public static void main(String[] args) {
       for (int i = 0; i < 2; i++){

            for (int k = 0; k < 2; k++){
                System.out.print("*");
                if (k % 2 == 1){
                    System.out.println("");
                }

            }
        }
/*

        for (int i = 0; i < 4; i++){
            System.out.print("*");
            if (i % 2 == 1){
                System.out.println("");
            }
        }
*/

    }

}
