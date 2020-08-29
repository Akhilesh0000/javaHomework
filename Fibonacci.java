import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b =1, fib;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        while ((n--) > 0) {
            fib = a + b;
            System.out.print(fib+" ");
            a = b;
            b = fib;
        }
        System.out.println();
    }
}