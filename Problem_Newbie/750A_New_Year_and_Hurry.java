import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int timeLeft = 240 - k;
        int totalTime = 0;
        int solved = 0;
        
        for (int i = 1; i <= n; i++) {
            totalTime += 5 * i;
            
            if (totalTime > timeLeft) {
                break;
            }
            
            solved++;
        }
        
        System.out.println(solved);
    }
}
