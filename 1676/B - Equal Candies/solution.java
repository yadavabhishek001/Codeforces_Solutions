import java.util.Scanner;
 
public class BEqualCandies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            boolean same = true;
 
            int prev = sc.nextInt();
            int count = prev;
            int minElement = prev;
 
            for(int i = 1; i<n ; i++){
                int a = sc.nextInt();
                if(minElement > a) minElement = a;
                count += a;
                if(prev != a) same = false;
                prev = a;
            }
 
            if(same || n == 1){
                System.out.println(0);
            }
            else{
                System.out.println( count - ( minElement * n ));
            }
        }
    }
}