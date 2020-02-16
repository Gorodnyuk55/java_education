package homework.beginner.loops;

/*Write a program that sum every even digit in a number 567898*/

public class task21 {
    public static void main(String[] args) {
        int number = 567898;
        int i = number;        // для цикла
        int sum = 0;          // для суммы

        while (i != 0){
            int count = i % 10;  // счеткик забирает последнюю цифру
           
            i = i/10;

            if (count % 2 == 0){   // если 
                sum += count;
                 System.out.println(sum);
            }
        }

        System.out.println(sum);
    }
}
