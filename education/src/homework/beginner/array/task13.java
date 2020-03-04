package homework.beginner.array;
/*Write a program that convert a decompose 3459 into romanian numbers*/
public class task13 {
    public static void main(String[] args) {
        int number = 3459;

//создаем строковый массив и разделяем число на цифры
        String[] mass = Integer.toString(number).split("");

// перебираем все цифры в массиве
        for (String strNumb : mass) {


            //конвертируем в число
            int numbNumb = Integer.parseInt(strNumb);

            switch (numbNumb) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
            }
        }

    }
}
