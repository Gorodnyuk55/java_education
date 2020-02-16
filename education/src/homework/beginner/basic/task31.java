package homework.beginner.basic;
            /*task31
            Write a program that display on console result of cos30*/
public class task31 {
        public static void main(String[] args) {
            double OneAngle = Math.PI / 180;
            double NumberAngle = 30 * OneAngle;

            double CosAngle = Math.cos(NumberAngle);

            System.out.println(CosAngle);
        }
}
