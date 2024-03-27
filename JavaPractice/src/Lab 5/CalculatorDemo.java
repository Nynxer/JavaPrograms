interface Calculator {
    public int add(int x, int y);

    public int sub(int x, int y);

    public int multiply(int x, int y);

    public int divide(int x, int y);

    public int remainder(int x, int y);
}

public class CalculatorDemo implements Calculator {
    public int add(int x, int y) {
        return (x + y);
    }

    public int sub(int x, int y) {
        return (x - y);
    }

    public int multiply(int x, int y) {
        return (x * y);
    }

    public int divide(int x, int y) {
        return (x / y);
    }

    public int remainder(int x, int y) {
        return (x % y);
    }

    public static void main(String args[]) {
        CalculatorDemo cd = new CalculatorDemo();
        System.out.println("ADD of two no is: " + cd.add(10, 10));
        System.out.println("SUB of two no is: " + cd.sub(1, 10));
        System.out.println("MULTIPLICATION of two no is: " + cd.multiply(5, 3));
        System.out.println("Divide of two no is: " + cd.divide(50, 10));
        System.out.println("REMAINDER of two no is: " + cd.remainder(50, 7));
    }
}
