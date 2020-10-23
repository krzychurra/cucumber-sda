public class Calculator {
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(2, 2);
        System.out.println(result);
    }
}
