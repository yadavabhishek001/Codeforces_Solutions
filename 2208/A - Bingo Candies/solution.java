import java.util.*;
 
public class A_Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            HashMap<Integer, Integer> map = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int a = sc.nextInt();
                    map.put(a, map.getOrDefault(a, 0) + 1);
                }
            }
            if(map.size() > n){
                System.out.println("YES");
                continue;
            }
            else{
                int max = 0;
                for(int v : map.values()){
                    max = Math.max(max, v);
                }
                if(max > n*(n-1))
                System.out.println("NO");
                else
                System.out.println("YES");
            }
        }
 
        sc.close();
    }
}