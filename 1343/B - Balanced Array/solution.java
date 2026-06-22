import java.util.*;
 
public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            if (n % 4 != 0) {
                System.out.println("NO");
                continue;
            }
 
            System.out.println("YES");
 
            int k = n / 2;
            int[] arr = new int[n];
 
            int sumEven = 0, sumOdd = 0;
 
            for (int i = 0; i < k; i++) {
                arr[i] = 2 * (i + 1);
                sumEven += arr[i];
            }
 
            for (int i = 0; i < k - 1; i++) {
                arr[k + i] = 2 * i + 1;
                sumOdd += arr[k + i];
            }
 
            arr[n - 1] = sumEven - sumOdd;
 
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}