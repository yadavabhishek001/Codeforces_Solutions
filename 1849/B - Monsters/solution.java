import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class BMonsters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();
 
            List<long[]> healthPoints = new ArrayList<>();
 
            for(int i = 0; i<n ; i++){
                long a = sc.nextLong();
                healthPoints.add(new long[]{a , i+1});
            }
 
            for(long hp[] : healthPoints){
                hp[0] = hp[0] % x;
 
                if(hp[0] == 0){
                    hp[0] = x;
                }
            }
 
            healthPoints.sort( (a,b)->{
                if(a[0] != b[0]){
                    return Long.compare(b[0], a[0]);
                }
                return Long.compare(a[1], b[1]);
            });
 
            for(long[] hp : healthPoints){
                System.out.print(hp[1] + " ");
            }
            System.out.println();
        }
    }
}