package homework.beginner.strings;
//Write a program that count how many 'a' symbols contains in a string
public class t_4_FindCountLettersInString {
    public static void main(String[] args) {
        String defaultString = "A hungry wolf is stronger than a satisfied dog";
        System.out.println(defaultString);

        char searchLetter = 'a';
//        System.out.println(defaultString.charAt(0));

        int count = 0;
        for (int i = 0; i < defaultString.length(); i++) {
            if (defaultString.charAt(i) == searchLetter){
                count++;
            }
        }
        System.out.println(count);
    }
}
