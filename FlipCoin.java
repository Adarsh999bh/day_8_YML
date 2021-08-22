import java.util.Scanner;
public class FlipCoin{
    public static void main(String[] args) {
        System.out.println("Enter the number of times the coin has to be flipped");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int head_count=0,tail_count=0;
        for(int i=0;i<n;i++){
            int res=(int) (Math.floor(Math.random()*10)%2);
            System.out.println(res);
            if(res==0){
                head_count++;
            }
            else{
                tail_count++;
            }
        }
        System.out.println("head count % "+(((float)head_count/(float)n)*100));
        System.out.println("tail count % "+(((float)tail_count/(float)n)*100));

    }
}