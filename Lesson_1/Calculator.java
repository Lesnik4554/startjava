public class Calculator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        char sign = '+';
        if (sign == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (sign == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (sign == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (sign == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (sign == '%') {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else if (sign == '^') {
            System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
        }
    }
}