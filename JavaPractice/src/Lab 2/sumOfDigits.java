import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int i, n, dig, sum = 0;
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

}