package homework.beginner.strings;
/*Write a program that revers all symbols in string*/

public class t_10_StringReverse {
    public static void main(String[] args) {
        String defaultString = "String";
        System.out.println(defaultString);

        char[] array = defaultString.toCharArray();
        /*System.out.println(defaultString.length());*/

        StringBuilder newString = new StringBuilder();
        for (int i = array.length-1; i >= 0 ; i--) {
            newString.append(array[i]);
        }
        System.out.print(newString);
    }
}
