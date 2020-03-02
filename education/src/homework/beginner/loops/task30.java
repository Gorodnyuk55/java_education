package homework.beginner.loops;
    /*Write programs that display on console all numbers from 2 to 20 with
        spaces between numbers and step 2*/
public class task30 {
        public static void main(String[] args) {
            for (int i = 2; i <=20 ; i += 2) {
                System.out.print(i + " ");
            }

            System.out.println();

            for (int j = 20; j >=2 ; j -= 2) {
                System.out.print(j + " ");

            }

        }
}
