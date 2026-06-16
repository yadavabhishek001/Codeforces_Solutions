import java.util.Scanner;

public class 546A_Soldiers_and_bananas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int dollers = sc.nextInt();
        int banana = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=banana ;i++) {
            int a = cost*i;
            sum  += a;
        }
        if(sum <= dollers){
         System.out.println(0);
        }
        else{
         System.out.println(sum - dollers);
        }
    }
}
