package homework.beginner.array;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that check if an array contains the values 55 and 45
 *
 */

class t_53_CheckTwoNumberInArray{
    public static void main(String[] args) {
        int mass1 [] = {5, 7, 45, 55, 4, 0,-9};
        int mass2 [] = {-10, 44, 55, 3,-54, 45};
        int searchNumber1 = 45;
        int searchNumber2 = 55;
        int searchSumm = searchNumber1 + searchNumber2;
        int searchNumberOne = 0;  // random number
        int searchNumberTwo = 0;  // random number

        for (int i = 0; i <= mass1.length-1 ; i++) {
            if (mass1[i] == searchNumber1 || mass1[i] == searchNumber2){
                searchNumberOne = mass1[i];
            }

            if (searchSumm == searchNumberOne + searchNumberTwo){
                break;
            }

            searchNumberTwo = searchNumberOne;
        }

        boolean numberPresentsInArray = (searchSumm == searchNumberOne + searchNumberTwo);
        System.out.println(numberPresentsInArray);
    }
}