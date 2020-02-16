package homework.beginner.basic;


/*task35
Write a program that calculate area of triangle with sides A = 4, B =
        5 , C = 6 (to calculate area of triangle use Heron formula)*/


public class task34 {
    public static void main(String[] args) {
        double a = 4;
        double b = 5;
        double c = 6;

        double p = (a + b + c) / 2;
        System.out.println(p);
        double AreaOfTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));



        System.out.println(AreaOfTriangle);
    }


}
