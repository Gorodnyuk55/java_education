package homework.beginner.strings;

// Write program that count how many letters contains in string

public class t_3_LettersContainsInString {
    public static void main(String[] args) {
        String defaultString = "A friendly word is better than a heavy cake";
        System.out.println(defaultString);
        System.out.println("String contains " +
                + defaultString.replace(" ", "").length() +
                " letters");
    }
}
