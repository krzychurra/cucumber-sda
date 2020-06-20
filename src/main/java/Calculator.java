public class Calculator {
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int divideTwoNumbers(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int result = addTwoNumbers(2, 2);
        System.out.println(result);
    }
}
