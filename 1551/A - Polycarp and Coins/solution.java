import java.util.Scanner;
 
public class A_Polycarp_and_Coins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
 
            int a1 = 0;
            int a2 = 0;
 
            if(n % 3 == 1){
                a1 = n / 3 + 1;
                a2 = n / 3;
            }
            else if(n % 3 == 2){
                a1 = n / 3;
                a2 = n / 3 + 1;
            }
            else{
                a1 = n / 3;
                a2 = n / 3;
            }
 
            System.out.println(a1 + " " + a2);
        }
    }
}