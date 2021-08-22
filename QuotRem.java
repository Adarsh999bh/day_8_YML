import java.util.Scanner;
public class QuotRem{
    public static void main(String[] args) {
        System.out.println("Enter the dividend");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the divisor");
        int n2=sc.nextInt();
        sc.close();
        System.out.println("Quotient : "+(n/n2));
        System.out.println("Reminder : "+(n%n2));
    }
}