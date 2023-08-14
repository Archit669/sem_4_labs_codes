import java.util.*;

public class ArchitAddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("sum of " + num1 + " and " + num2 + " is " + sum);

        sc.close();
    }
}
