package homework.beginner.basic;

// task14
//Write a program that check if 10 does not belong to the interval [49, 101]


public class task14 {
    public static void main(String[] args) {


   int checkVariable = 101;
    int maxPointInterval= 101;
    int minPointInterval= 49;


    boolean checkBelong = (minPointInterval <= checkVariable) && (maxPointInterval >= checkVariable);

        if (checkBelong == true){
            System.out.println("checkVariable belong to the interval [49, 101]");
        }
            else {
                System.out.println("checkVariable not belong to the interval [49, 101]");
            }

     /*   int checkVariable = 10;
        boolean checkBelong = 49 <= checkVariable && checkVariable <= 101;
        if (checkBelong == true) {
            System.out.println("checkVariable belong to the interval [49, 101]");
        }
        else {
            System.out.println("checkVariable not belong to the interval [49, 101]");
        }*/
    }
}
