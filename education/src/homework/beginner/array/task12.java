package homework.beginner.array;
/*Write a program that decompose a number 14367*/
public class task12 {
    public static void main(String[] args) {


        int number = 14367;
        int count = Integer.toString(number).length();
        String[] mass = Integer.toString(number).split("");

        int decomposeVar = 1;


        //для делителя (1- 1, 2- 10, 3-100, 4-1000)
               for (int i = 1; i < count; i++) {
            decomposeVar *=10;
        }

        //заполнить массив
        for (String digit:mass
             ) {
            int numbNumb = Integer.parseInt(digit); // преобразуем в число
            numbNumb *= decomposeVar;
            System.out.println(numbNumb);
            decomposeVar /= 10;
        }

    }
}
