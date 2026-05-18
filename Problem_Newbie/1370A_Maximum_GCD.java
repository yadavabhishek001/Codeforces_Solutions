import java.util.Scanner;

public class A_Maximum_GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if(n==1){
                System.out.println(1);
                continue;
            }
            System.out.println(n/2);
        }
        sc.close();
    }
}
