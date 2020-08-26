import java.util.Scanner;

public class PerfectSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int sum;
        for (int num=1; num<=n; num++) {
            sum = 0;
            for (int i=1; i<num; i++)
                if (num%i==0)
                    sum+=i;
            if (sum==num)
                System.out.print(num+" ");
        }

    }
}