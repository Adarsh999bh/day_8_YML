import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        System.out.println("Enter third number");
        int n3=sc.nextInt();
        System.out.println("largest of 3 numbers is : "+larg(n1, n2, n3));
    }
    private static int larg(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
}