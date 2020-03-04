package homework.beginner.array;
 /*Write a program that convert a number 167 into words*/
public class task11 {
  public static void main(String[] args) {
   int number = 167;

//создаем строковый массив и разделяем число на цифры
   String[] mass = Integer.toString(number).split("");

// перебираем все цифры в массиве
   for (String strNumb : mass) {


    //конвертируем в число
    int numbNumb = Integer.parseInt(strNumb);

    switch (numbNumb) {
     case 1:
      System.out.println("one");
      break;
     case 2:
      System.out.println("two");
      break;
     case 3:
      System.out.println("three");
      break;
     case 4:
      System.out.println("four");
      break;
     case 5:
      System.out.println("five");
      break;
     case 6:
      System.out.println("six");
      break;
     case 7:
      System.out.println("seven");
      break;
     case 8:
      System.out.println("eight");
      break;
     case 9:
      System.out.println("nine");
      break;
     case 0:
      System.out.println("zero");
      break;
    }
   }

  }

}
