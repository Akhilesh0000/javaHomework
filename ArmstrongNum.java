import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        sc.close();

        int n, tmp, res;
        for (n=0, tmp=x; tmp>0; n++)
            tmp = tmp / 10;
        
        tmp = x;
        res = 0;
        while (tmp > 0) {
            res += Math.pow(tmp % 10, n);
            tmp /= 10;
        }
        
        if (x == res)
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
    }
}