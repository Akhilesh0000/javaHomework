import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int space=0; space<n-i; space++)
                System.out.print(" ");
            for (int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}