public class Arithmetic {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int intAddition = a + b;
        int intDivision1 = a/b;
        int intDivision2 = b/a;

        float x = 3.2f;
        float y = 2.3f;
        float floatAddition = x + y;
        float floatDivision1 = x/y;
        float floatDivision2 = y/x;

        System.out.println("The result of addition of integers " + a + " and " + b + " is " + intAddition);
        System.out.println("The result of division of integer " + a + " by " + b + " is " + intDivision1);
        System.out.println("The result of division of integer " + b + " by " + a + " is " + intDivision2);

        System.out.println("______________________");

        System.out.println("The result of addition of floats " + x + " and " + y + " is " + floatAddition);
        System.out.println("The result of division of float " + x + " by " + y + " is " + floatDivision1);
        System.out.println("The result of division of float " + y + " by " + x + " is " + floatDivision2);

    }
}
