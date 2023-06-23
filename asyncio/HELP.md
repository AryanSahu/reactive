public class BugExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int result = divideNumbers(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int divideNumbers(int a, int b) {
        // Bug 1: Division by zero is not handled
        int result = a / b;
        return result;
    }

    public static void doSomething() {
        // Bug 2: Unused method with no implementation
    }

    public void nonStaticMethod() {
        // Bug 3: Non-static method in a static context (main method)
        System.out.println("Non-static method");
    }
}


