import java.util.Scanner;
public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int maxDist = 0;
            int dist = 0;
            int prev = 0;
            for(int i = 0; i<n ; i++){
                int a = sc.nextInt();
                
                dist = a-prev;
                if(i == n-1){
                    dist = Math.max(dist, 2*(x-a));
                }
                maxDist = Math.max(maxDist,dist);
                prev = a;
            }
            System.out.println(maxDist);
        }
    }
}