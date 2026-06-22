import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // If already divisible by 7, do nothing
            if (n % 7 == 0) {
                System.out.println(n);
            } else {
                // Strip the last digit (e.g., 23 becomes 20)
                int base = n - (n % 10);
                
                // Find which last digit (0-9) makes it divisible by 7
                for (int i = 0; i <= 9; i++) {
                    if ((base + i) % 7 == 0) {
                        System.out.println(base + i);
                        break; // We only need one valid answer
                    }
                }
            }
        }
        sc.close();
    }
}