package homework.beginner.loops;

public class t_47_Figure_hello_world {
    public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <=25; j++) {

                if (i == 3 && j == 8){
                    System.out.print("h");
                }

                else if (i == 3 && j == 9){
                    System.out.print("e");
                }

                else if (i == 3 && j == 10){
                    System.out.print("l");
                }

                else if (i == 3 && j == 11){
                    System.out.print("l");
                }

                else if (i == 3 && j == 12){
                    System.out.print("o");
                }

                else if (i == 3 && j == 13){
                    System.out.print(" ");
                }


                else if (i == 3 && j == 14){
                    System.out.print("w");
                }

                else if (i == 3 && j == 15){
                    System.out.print("o");
                }

                else if (i == 3 && j == 16){
                    System.out.print("r");
                }

                else if (i == 3 && j == 17){
                    System.out.print("l");
                }

                else if (i == 3 && j == 18){
                    System.out.print("d");
                }

                 else if ((i == 1 || i == 5) && j % 2 == 1 || j==1 || j == 25 ) {
                    System.out.print("*");
                }


                else System.out.print(" ");
            }


            System.out.println();
        }

    }
    
}
