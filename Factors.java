import java.util.Scanner;
class Factors{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Prime factors of "+n+" are :");
        for(int i=2;i<n/2;i++){
            if(n%i==0 && isprime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isprime(int fact){
        if(fact==2 || fact==3){
            return true;
        }
        else{
            for (int i = 2; i <= fact / 2; ++i) {
                if(fact%i==0){
                    return false;
                }
        }
        return true;
    }
}
}