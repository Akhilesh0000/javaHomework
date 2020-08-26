import java.util.Scanner;

public class PrimeSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        boolean flag;

        for (int num=1; num<=n; num++) {
            flag = false;
            for (int i=2; i<num; i++)
                if (num%i==0) {
                    flag = true;
                    break;
                }
            if (!flag)
                System.out.print(num+" ");
        }
        System.out.println();
    }
}