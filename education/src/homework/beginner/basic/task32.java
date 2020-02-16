package homework.beginner.basic;

                /*task32
                Write a program that display on console result of tan30*/

public class task32 {
    public static void main(String[] args) {
        double OneAngle = Math.PI / 180;
        double NumberAngle = 30 * OneAngle;

        double TanAngle = Math.tan(NumberAngle);

        System.out.println(TanAngle);
    }
}
