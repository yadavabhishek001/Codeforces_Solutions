import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] doors = new int[n];
 
            int first = -1;
            int last = -1;
 
            for (int i = 0; i < n; i++) {
                doors[i] = sc.nextInt();
 
                if (doors[i] == 1) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
 
            int needed = last - first + 1;
 
            if (needed <= x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
 
        sc.close();
    }
}