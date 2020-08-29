import java.util.Scanner;

public class fibMul {
    public static void main(String[] args) {
        int a = 2, b = 3, fib;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print(a+" "+b+" ");
        while ((n--) > 0) { 
            fib = a * b;
            System.out.print(fib+" ");
            a = b;
            b = fib;
        }   
        System.out.println();
    }
}