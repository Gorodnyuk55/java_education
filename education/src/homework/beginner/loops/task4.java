package homework.beginner.loops;
            /*    Write programs that show on console all numbers from 1 to 10 with step
            1 for 4 columns in one line (number delimeter is space symbol)*/
public class task4 {
                public static void main(String[] args) {
                    System.out.println("Output 1");

                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                        if (i % 4 == 0) {
                            System.out.println(" ");
                        }
                    }
                    System.out.println("");
                    System.out.println("Output 2");


                    for (int k = 10, j = 1; k > 0; k--, j++) {


                        System.out.print(k + " ");
                        if (j % 4 == 0) {
                            System.out.println(" ");
                        }
                    }

                }
            }

