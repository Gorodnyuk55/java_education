package homework.beginner.loops;
  /* Write a program that print all ASCII symbols*/
public class task38 {
      public static void main(String[] args) {
          for (char i = 32; i <=127 ; i++) {
              System.out.print(i + " ");

              if (i % 16 == 0){
                  System.out.println();
              }
          }
      }
}
