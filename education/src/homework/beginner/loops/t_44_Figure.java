package homework.beginner.loops;

public class t_44_Figure {
    public static void main(String[] args) {

        int width = 11;
        int height = 9;
        int centerW = width / 2 + 1;
        int centerH = height / 2 + 1;

        for (int i = 1; i <= width ; i++) {
            for (int j = 1; j <= height; j++) {

                if (i == centerW || j == centerH){
                    System.out.print("*");
                }
                else System.out.print(" ");

       }
            System.out.println();
        }
    }
}
