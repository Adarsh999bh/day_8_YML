import java.util.Scanner;
public class Powoftwo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number less tahn 32 ");
        int n=sc.nextInt();
        sc.close();
        int pro=1;
        for(int i=0;i<n;i++){
            pro*=2;
        }
        System.out.println(pro);
    }
}