import java.util.Scanner;
public class owcons{
    public static void main(String[] args) {
        System.out.println("enter any english alphabet");
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("Its a vowel ");
        }
        else{
            System.out.println("its a consonant ");
        }
        sc.close();
    }
}