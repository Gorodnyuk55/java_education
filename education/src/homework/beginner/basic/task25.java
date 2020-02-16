package homework.beginner.basic;
        /*  task25
            Write a program that calculate e3
            where e is Euler’s number */

public class task25 {

    public static void main(String[] args) {
        int degree = 3;
        double EulerNumberInDegree = Math.exp(degree) ;
        System.out.println(EulerNumberInDegree);

    }


/*    public static void main(String[] args) {

        double EulerNumberInDegree = Math.pow(Math.exp(1), 3) ;
        System.out.println(EulerNumberInDegree);

    }*/
}