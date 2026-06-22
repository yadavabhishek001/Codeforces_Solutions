import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int maxLen = 1;
        int currLen = 1;
 
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
            }
 
            maxLen = Math.max(maxLen, currLen);
        }
 
        System.out.println(maxLen);
    }
}