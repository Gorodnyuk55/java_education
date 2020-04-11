package homework.beginner.strings;
/*
 * @author Maxim Gorodnyuk
 *
 * Write a program that remove extra spaces in string
 *
 */



public class t_32_DeleteExtraSpace {
    public static void main(String[] args) {
        String sentence = "If debugging is the process of removing software bugs   then programming must" +
                "be the process of putting them      in";

        System.out.println(sentence.replaceAll("[\\s]{2,}", " "));







        
   
    }
}
