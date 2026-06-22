import java.util.Scanner;
 
public class ADestroyingTowers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;
 
            int min  = sc.nextInt();
            sum = min;
 
            for(int i = 1; i<n ; i++){
                int a = sc.nextInt();
                if(min >= a){
                    sum += a;
                    min = a;
                }
                else{
                    sum += min;
                }
            }
            System.out.println(sum);
        }
    }
}