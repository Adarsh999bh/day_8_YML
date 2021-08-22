import java.util.Scanner;
public class HarmonicNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        sc.close();
        double summ=0;
        for(int i=1;i<=n;i++)
            summ+=(double)1/(double)i;
        System.out.print(n+"th harmonic number is : ");
        System.out.println(summ);
    }
}