import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (i=1; i<=n; i++) {
            for (j=i; j<=n; j++)
                System.out.print(j+" ");
            for (j=i-1; j>0; j--)
                System.out.print(j+" ");
            System.out.print("\n");
        }
    }
}