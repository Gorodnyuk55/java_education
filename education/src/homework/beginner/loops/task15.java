package homework.beginner.loops;

/*Write a program that find sum of first and last digits of the number 45678*/

public class task15 {
    public static void main(String[] args) {
        int numb = 45678;
        int firstNumb = 0, lastNumb;




        System.out.println("Number - " + numb);

        for (int i = 1; i <= numb; i *= 10) {
            firstNumb = numb / i;
        }
        System.out.println("First number - " + firstNumb);


        int j = numb;
        int b = 0;
        while (j >= 10) {

            b = j % 10;
            if (b % 10 == 0) continue;
            else break;
        }

        lastNumb = b;

        System.out.println("Last number - " + lastNumb);

        /*sum = firstNumb + lastNumb;
        System.out.print("sum of first and last digits " + numb + " : " + sum);*/

        System.out.println(sumMetod(firstNumb, lastNumb));


    }

    public static int sumMetod(int a, int b){
      return a + b;

    }


}