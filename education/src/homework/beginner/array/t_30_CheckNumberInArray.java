package homework.beginner.array;

//Write a program that check if in the input array presents values 10 and
//11, if those values are present that print on console true if not than false

public class t_30_CheckNumberInArray {
    public static void main(String[] args) {
        int mass1 [] = {4, 2356, 4, 32, 11, 578, 34, 7, 35, 547, 345, 6, 24, 10, 523, 5, 324};
        int mass2 [] = {234, 54, 23, 411, 33, 11, 3, 21, 5, 57, 45, 7, 10, 3, 234, 5, 53, 45};
        int searchNumber1 = 10;
        int searchNumber2 = 11;
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
