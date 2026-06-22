import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class BAllDistinct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            
             HashSet<Integer> set = new HashSet<>();
 
            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
            int distinct = set.size();
 
            if ((n - distinct) % 2 == 0)
                System.out.println(distinct);
            else
                System.out.println(distinct - 1);
        }
    }
}