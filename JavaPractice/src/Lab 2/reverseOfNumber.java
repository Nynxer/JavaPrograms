import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        int i, num, dig, rev = 0;
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num != 0) {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;

        }
        System.out.println("Reverse number is: " + rev);
    }
}
