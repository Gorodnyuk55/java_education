package homework.beginner.strings;

/**
 *
 * Write a program that validate algebraic equation (use
 * simple validation, just count opened and closed parentheses)
 *
 */

public class t_18_ValidateAlgebraicEquation {
    public static void main(String[] args) {
        String expressionOne = ")a + b ( = 0";
        String expressionTwo = "(a + b) + c ) = 0";

        System.out.println(checkParentheses(expressionOne));
        System.out.println(checkParentheses(expressionTwo));
    }



    private static boolean checkParentheses (String expression){


        String [] array = expression.split("");
        int count = 0;
        String parenthesesOpened = "(";
        String parenthesesClosed = ")";
        for (int i = 0; i < array.length; i++) {

           if (array[i].equals(parenthesesOpened)){
               count++;
           }
           if (array[i].equals(parenthesesClosed)){
               count--;
           }

        }

        if (count == 0) return true;
        else return false;

    }
}
