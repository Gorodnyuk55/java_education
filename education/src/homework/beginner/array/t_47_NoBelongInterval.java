package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that display on a console those elements of the array
 * that does not belong to the interval 15, 35
 *
 */

public class t_47_NoBelongInterval {
    private int minNumber;
    private int maxNumber;


    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public t_47_NoBelongInterval(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }


}

 class t_47_NoBelongIntervalDemo {
    public static void main(String[] args) {
        t_47_NoBelongInterval t = new t_47_NoBelongInterval(15, 35);
        int [] mass = {3, 4, 7, 16, 20, 3, 23, 30, 29, 4, 6, 8, 56, 32, 213, 53, 423, 7, 324, 442};
      /*  System.out.println(t.getMaxNamber()),
        System.out.println(t.getMinNamber()),*/

        for (int i : mass) {
            if (i > t.getMaxNumber() || i < t.getMinNumber()){
                System.out.print(i + " ");
            }
        }


    }
}