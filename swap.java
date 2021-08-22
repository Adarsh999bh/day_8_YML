import java.util.Scanner;
public class swap{
    public static void main(String[] args) {
        System.out.println("Enter the number A");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number B");
        int n2=sc.nextInt();
        System.out.println("before swapping : ");
        System.out.println("A = "+n);
        System.out.println("B = "+n2);
        //swap
        n=n+n2;
        n2=n-n2;
        n=n-n2;
        System.out.println("after swapping : ");
        System.out.println("A = "+n);
        System.out.println("B = "+n2);
        sc.close();
    }
}