import java.util.Scanner;
 
public class A_Extremely_Round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            int x = 0;
            while(n>0){
                int rem = 0;
                count++;
                if(n<10){
                    x = n;
                }
                n = n/10;
            }
            int ans = 0;
            while(count-- > 1){
                ans += 9;
            }
            System.out.println(ans+x);
        }
    }
}