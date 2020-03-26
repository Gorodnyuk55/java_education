package homework.beginner.strings;
    //Write a program that convert all symbols in string into ASCII symbols
    //and calculate sum of all values
public class t_16_CalculateSum {
        public static void main(String[] args) {
            String sentance = "Keep fire away from straw";
            char [] sentenceArray = sentance.toCharArray();
            int number = 0;

            for(int i = 0; i < sentenceArray.length; i++) {
                number += sentenceArray[i];

            }

            System.out.println("Sum of all value = " + number);
        }


    }
