import java.util.*;
 
public class A_I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();  // total levels
 
        boolean[] visited = new boolean[n + 1];
 
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            int level = sc.nextInt();
            visited[level] = true;
        }
 
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int level = sc.nextInt();
            visited[level] = true;
        }
 
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
 
        System.out.println("I become the guy.");
        sc.close();
    }
}