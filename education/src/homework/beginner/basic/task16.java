package homework.beginner.basic;

/* Write a program that convert 1000000 kilobytes into megabytes (1 megabyte
            = 1024 kilobytes)*/

public class task16 {
    public static void main(String[] args) {

        int numberKilobytes = 1000000;
        int numberMegabytes = numberKilobytes / 1024;

        System.out.println ("1000000 kilobytes contains " + numberMegabytes + " megabytes");
    }

}
