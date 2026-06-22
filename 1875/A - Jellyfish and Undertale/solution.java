import java.util.Scanner;
 
public class AJellyfishAndUndertale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
 
            long sum = b;
 
            for(int i = 0; i<n; i++){
                int a1 = sc.nextInt();
 
                if(a1 + 1 <= a){
                    sum += a1;
                }
                else{
                    sum += (a - 1);
                }
            }
            System.out.println(sum);
        }
    }
}