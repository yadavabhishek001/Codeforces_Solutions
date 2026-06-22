import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t ; i++){
           int n = sc.nextInt();
           int s = sc.nextInt();
           int x = sc.nextInt();
           int sum = 0;
           for(int j = 0; j<n ; j++){
               int a = sc.nextInt();
               sum += a;
           }
           if(sum > s){
               System.out.println("NO");
           }
           else{
               int r = s - sum;
               if(r % x == 0){
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }
           }
        }
    }
}