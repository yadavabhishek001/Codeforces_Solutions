import java.util.*;
 
public class B_Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            long lowestFirstMinimum = Long.MAX_VALUE;
            long lowestSecondMinimum = Long.MAX_VALUE;
            long sumOfSecondElements = 0;
 
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
 
                long first = Long.MAX_VALUE;
                long second = Long.MAX_VALUE;
 
                for (int j = 0; j < m; j++) {
                    long val = sc.nextLong();
 
                    if (val < first) {
                        second = first;
                        first = val;
                    } else if (val < second) {
                        second = val;
                    }
                }
 
                lowestFirstMinimum = Math.min(lowestFirstMinimum, first);
                lowestSecondMinimum = Math.min(lowestSecondMinimum, second);
                sumOfSecondElements += second;
            }
 
            long answer = sumOfSecondElements + (lowestFirstMinimum - lowestSecondMinimum);
            System.out.println(answer);
        }
 
        sc.close();
    }
}