package homework.beginner.loops;
/*Write a program that print pascal triangle with rows 5*/
public class task37 {

        public static void main(String[] args) {
            for ( int i =  0 ; i < 5; i++ ) {
                int z =  1 ;

                for ( int j =  0 ; j <= i; j ++ ) {
                    System .out.print (z + " ");
                    z = z * (i - j) / (j + 1);
                }

                System .out.println ();
            }




        }

}
