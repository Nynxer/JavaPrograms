import java.util.Scanner;

public class emp {
    public static void main(String[] args) {
        String empName;
        int empSalary, empAge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employee, their Age & Salary");
        empName = sc.nextLine();
        empAge = sc.nextInt();
        empSalary = sc.nextInt();
        System.out.println(empName + "    " + empAge + "    " + empSalary);

    }

}
