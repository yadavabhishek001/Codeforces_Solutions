import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            // Start values for our mathematical pattern
            int evenVal = 2 * n;
            int oddVal = (n % 2 != 0) ? n : n - 1;
            
            // Alternating pattern filling a simple array
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    a[i] = evenVal;
                    evenVal -= 2;
                } else {
                    a[i] = oddVal;
                    oddVal -= 2;
                }
            }
            
            // Print the array elements separated by spaces
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}