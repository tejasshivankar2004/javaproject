import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double ans;
        if (op == '+') ans = a + b;
        else if (op == '-') ans = a - b;
        else if (op == '*') ans = a * b;
        else if (op == '/') ans = b != 0 ? a / b : Double.NaN;
        else {
            System.out.println("Invalid operation");
            sc.close();
            return;
        }

        System.out.println("Result = " + ans);
        sc.close();
    }
}
