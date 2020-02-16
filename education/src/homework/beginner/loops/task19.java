package homework.beginner.loops;

/*Write a program that glue number 58 and number 123*/

public class task19 {
    public static void main(String[] args) {
        int firstNumb = 58;
        int secondNumb = 123;

        String str1 = Integer.toString(firstNumb);
        String str2 = Integer.toString(secondNumb);

        int glueNumbers = Integer.parseInt(str1+str2);

        System.out.println(glueNumbers);

    }

}
