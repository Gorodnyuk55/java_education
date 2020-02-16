package homework.beginner.basic;

    /*task30
    Write a program that display on console result of sin90*/

public class task30 {
    public static void main(String[] args) {
        double OneAngle = Math.PI / 180;
        double NumberAngle = 90 * OneAngle;

        double SinAngle = Math.sin(NumberAngle);

        System.out.println(SinAngle);

    }
}
