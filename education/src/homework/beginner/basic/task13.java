package homework.beginner.basic;

/*task13
Write a program that do the following code instructions:
        • define a function that take three integer type parameters
        • function must return arithmetic equation (parameter1∗parameter2)/parameter3
        • call function with values 123, 324 and 30
        • print result on console*/

public class task13 {

    public static void main(String[] args) {

        int VariableArithmeticEquation = GetArithmeticEquation (123, 324, 30);
        System.out.println(VariableArithmeticEquation);
    }

    public static int GetArithmeticEquation (int parameter1, int parameter2, int parameter3) {
        return (parameter1 * parameter2) / parameter3;
    }
}
