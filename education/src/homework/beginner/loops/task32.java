package homework.beginner.loops;
/*Write programs that display on console all cubes of numbers from 1 to
        10 space separated*/
public class task32 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }


        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
    }
}
