public class Calculator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        char sign = '+';
        double sum = 0;
        sum = a + b;
        if (sign == '+') {
            System.out.println(a + " + " + b + " = " + sum);
        } else {
            System.out.println(b + " + " + a + " = " + sum);
        }
        sum = a - b;
        if (sign == '-') {
            System.out.println(a + " - " + b + " = " + sum);
        } else {
            System.out.println(b + " - " + a + " = " + sum);
        }
        sum = a * b;
        if (sign == '*') {
            System.out.println(a + " * " + b + " = " + sum);
        } else {
            System.out.println(b + " * " + a + " = " + sum);
        }
        sum = a / b;
        if (sign == '/') {
            System.out.println(a + " / " + b + " = " + sum);
        } else {
            System.out.println(b + " / " + a + " = " + sum);
        }
        sum = a % b;
        if (sign == '%') {
            System.out.println(a + " % " + b + " = " + sum);
        } else {
            System.out.println(b + " % " + a + " = " + sum);
        }
        sum = (a + b) * (a + b);
        if (sign == '^') {
            System.out.println(a + " ^ " + b + " = " + sum);
        } else {
            System.out.println(b + " ^ " + a + " = " + sum);
        }
    }
}