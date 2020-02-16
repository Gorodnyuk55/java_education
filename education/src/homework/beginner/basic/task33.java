package homework.beginner.basic;

                /*task32
                Write a program that display on console result of ctg30*/

public class task33 {
    public static void main(String[] args) {
        double OneAngle = Math.PI / 180;
        double NumberAngle = 25 * OneAngle;

        double CtgAngle = 1 / Math.tan(NumberAngle);

        System.out.println(CtgAngle);
    }
}
