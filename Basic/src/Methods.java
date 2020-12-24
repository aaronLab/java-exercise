public class Methods {

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String name) {
        System.out.printf("Hello, %s.", name);
        System.out.println();
    }

    public static int till100() {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    private static int calculate(logic logic, int num1, int num2) {
        int result = switch (logic) {
            case Add -> num1 + num2;
            case Minus -> num1 - num2;
            case Multiply -> num1 * num2;
            case Divide -> num1 / num2;
        };
        return result;
    }

    public static void main(String[] args) {
        int addedNum = addNum(3, 4);
        System.out.println(addedNum);

        sayHello("Aaron");

        int till100 = till100();
        System.out.println(till100);

        int num1 = calculate(logic.Add, 1, 2);
        int num2 = calculate(logic.Minus, 1, 2);
        int num3 = calculate(logic.Multiply, 1, 2);
        int num4 = calculate(logic.Divide, 2, 1);

        System.out.printf("%d, %d, %d, %d", num1, num2, num3, num4);
    }

    public enum logic {
        Add, Minus, Multiply, Divide
    }
}
